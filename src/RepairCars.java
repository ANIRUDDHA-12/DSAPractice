public class RepairCars {
    long countCars(int [] ranks,long time ){
        long count=0;
        for(int rank:ranks){
            count+=(long) Math.sqrt(time/rank);
        }
        return count;
    }
    public long repairCars(int [] ranks,int cars){
        long low=1;
        long high=ranks[0]*cars*cars;
        long ans=1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(countCars(ranks,mid)>=cars){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        RepairCars cars=new RepairCars();
        int [] ranks={4,2,3,1};
        int totalNeeded=10;
        long answer=cars.repairCars(ranks,totalNeeded);
        System.out.println("The answer for the following is"+answer);


    }
}
