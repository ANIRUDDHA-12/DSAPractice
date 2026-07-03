public class SecondLargestElement {
    public int secondLargest(int [] nums ){
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;
        if(nums==null || nums.length<2) return -1;
        for(int num:nums){
            if(num>large){
                secondLarge=large;
                large=num;
            } else if (num>secondLarge && num<large) {
                secondLarge=num;
            }
        }
        return (secondLarge==Integer.MIN_VALUE)?-1: secondLarge;
    }
}
