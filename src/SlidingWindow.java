public class SlidingWindow{
    public static void main(String args[]){
        int[] tips = {2, 5, 1, 8, 2, 9, 1};
        int k = 3;

        if(tips == null || tips.length<k){
            System.out.println("Input length too Short");
        }
        int currentSum=0;
        for(int i =0;i<k;i++){
            currentSum+=tips[i];
        }
        int maxSum= currentSum;

        for(int i =k;i<tips.length;i++){
            currentSum+=tips[i]-tips[i-k];
             maxSum= Math.max(currentSum,maxSum);
        }

        System.out.println("Now the maximum window is "+" "+ maxSum);
    }

}