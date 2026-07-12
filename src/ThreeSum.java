import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> generateThreeSum(int [] nums){
        if(nums==null || nums.length<3) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
    }
    public static void main(String [] args){
        ThreeSum threeSum=new ThreeSum();
        int [] listDisplay=new int[]{1,2,-3,4};
            List<List<Integer>> display=threeSum.generateThreeSum(listDisplay);
            System.out.println(display);
    }
}
