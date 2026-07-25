class SolutionCows {
    boolean canWePlaceCows(int [] nums,int dist,int k){
        int cows=1;
        int last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-last>=dist){
                cows++;
                last=nums[i];
            }
            if(cows>=k) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=nums[n-1]-nums[0];
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canWePlaceCows(nums,mid,k)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return high;
    }
}
