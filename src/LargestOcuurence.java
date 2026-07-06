public class LargestOcuurence {
    public int majorityElement(int [] nums){
        int start=nums[0];
        int count=0;
        for(int num:nums){
            if(count==0){
                num=start;
                count++;
            } else if (count==num) {
                count++;
            }else{
                count--;
            }
        }
        return start;
    }
}
