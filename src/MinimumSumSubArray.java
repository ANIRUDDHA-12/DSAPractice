public class MinimumSumSubArray {
    public int lessThanTarget(int [] nums,int target){
        int left=0;
        int minLength=Integer.MAX_VALUE;
        int currentSum=0;
        for(int right=0;right<nums.length;right++){
            currentSum+=nums[right];
            while(currentSum>=target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }
        return (minLength==Integer.MAX_VALUE)?0:minLength;
    }
    public static void main(String [] args){
        MinimumSumSubArray sumLessThanTarget=new MinimumSumSubArray();
        int [] arr={1,2,3,5,6,7,8,9};
        int k=9;
        int result=sumLessThanTarget.lessThanTarget(arr,k);
        System.out.println(result);
    }
}
