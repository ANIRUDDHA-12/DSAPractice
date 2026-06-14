import java.util.Arrays;

public class SubArrayAveragesPrefix {
    public int[] getAverages(int [] nums,int k){
        int windowSize=2*k+1;
        int n=nums.length;
        int [] ans= new int[n];
        Arrays.fill(ans, -1);
       if(n<windowSize){
           return ans;
       }
        long[] prefix= new long[nums.length+1];
        for(int i=0;i< n;i++){
            prefix[i+1]=nums[i]+prefix[i];
        }
        for(int i=k;i<n-k;i++){
            int L=i-k;
            int R= k+i;
            long windowSum= prefix[R+1]-prefix[L];
            ans[i]=(int)(windowSum/windowSize);
        }
    return ans;
    }
}