public class MaximumSubArrayProductLessThanK {
    public int maximumProductLessThanK(int [] nums,int k){
        if(k<=1) return 0;
        int left=0;
        int maxCount=0;
        int currentProduct=1;
        for(int right=0;right<nums.length;right++){
            currentProduct*=nums[right];
            while(currentProduct>=k){
                currentProduct/=nums[left];
                left++;
            }
            maxCount=right-left+1;
        }
        return maxCount;
    }
    public static void main(String [] args){
        MaximumSubArrayProductLessThanK product=new MaximumSubArrayProductLessThanK();
        int [] arr=new int[]{1,2,3,7,8,6,4};
        int max=9;
        int result=product.maximumProductLessThanK(arr,max);
        System.out.println(result);
    }
}
