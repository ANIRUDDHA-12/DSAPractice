public class MinimumBouquetsToBeMade {
    public int minimumBouquets(int [] bloomDay,int m,int k){
        if((long) k*m > bloomDay.length)return -1;
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;

        for(int day:bloomDay){
            left=Math.min(day,left);
            right=Math.max(day,right);
        }
        int currentDay=0;
        int bestDay=0;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(canMakeBouquets(bloomDay,m,k,mid)){
                bestDay=mid;
                right=right-1;
            }
            else{
                left=left+1;
            }

        }
        return bestDay;
    }
    private boolean canMakeBouquets(int [] bloomDay,int m,int k, int currentDay){
        int flowersToday=0;
        int bMade=0;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=currentDay){
                flowersToday++;
                if(flowersToday==k){
                    bMade++;
                    flowersToday=0;
                }
            }else{
                flowersToday=0;
            }
        }
        if(bMade>=m){
            return true;
        }
        else{
            return  false;
        }
    }
}
