public class InPlace80 {
    public int removeDuplicates(int [] nums){
        int write=2;
        if(nums == null || nums.length<=2) return nums.length;
        for(int read=0; read<nums.length;read++){
            if(nums[read]!= nums[write-2]){
                nums[write]=nums[read];
                write++;
            }

        }
        return write;
    }
}