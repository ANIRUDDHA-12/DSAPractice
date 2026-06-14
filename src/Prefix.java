import java.util.Arrays;
public class Prefix{
    public static int[] buildInt(){
        int [] nums = {1,2,3,4,5};
        int [] newArr = new int[nums.length+1];

        for(int i =0;i< nums.length;i++){
            newArr[i+1]=newArr[i]+nums[i];
        }
        return newArr;
    }

    public void answerQueries(int[] nums, int[][] queries){
        int [] combineArr = new int[nums.length+1];
        for(int i =0;i<nums.length;i++){
            combineArr[i+1]= combineArr[i]+nums[i];
        }

        for(int [] query:queries){
            int L=query[0];
            int R=query[1];

            int sum = combineArr[R + 1] - combineArr[L];
        }

    }

    public int findPivot(int [] nums){
        int totalSum=0;
        for (int num : nums) {
            totalSum += num;
        }
       int leftSum=0;
       for(int i=0;i<nums.length;i++){
           int rightSum=totalSum-leftSum-nums[i];
           if(leftSum==rightSum){
               return i;
           }
               leftSum+=nums[i];
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] result = buildInt();
        // Arrays.toString() helps print the actual contents of the array
        System.out.println(Arrays.toString(result));
    }
}

