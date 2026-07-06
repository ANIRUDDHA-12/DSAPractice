public class KadaneAlgo {
    public int findLargestSum(int [] nums){
        int max=Integer.MIN_VALUE;
        int currentBag=0;
        for(int i=0;i< nums.length;i++){
            int currentCount=nums[i];
            currentBag+=currentCount;
            if(currentBag>max){
                max=currentBag;
            }
            if(currentBag<0){
                currentBag=0;
            }
        }
        return max;
    }
}
