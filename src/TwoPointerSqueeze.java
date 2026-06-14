public class TwoPointerSqueeze{
    public static void main(String args[]){
        int[] years = {1990, 1995, 2002, 2008, 2015, 2020};
        int target = 4010;
        int left =0;
        int right = years.length-1;


        while(left<right){
            int currentSum=years[left]+years[right];
            if(currentSum == target){
                System.out.println("Pairs found at "+years[left]+" "+years[right]);
                return ;
            }
             else if(currentSum<target){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("No pairs");

    }
}