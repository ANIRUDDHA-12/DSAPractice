public class SingleNumberArray {
    public int singleNumber(int[] nums) {
        if(nums==null) return -1;
        int result=0;
        for(int num:nums){
            result=result^num;
        }
        return result;
    }
}
