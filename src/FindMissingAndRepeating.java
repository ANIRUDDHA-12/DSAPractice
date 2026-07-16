public class FindMissingAndRepeating {
    public int[] findMissing(int [] nums){
        long n=nums.length;
        long sn=n*(n+1)/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        long s1=0;long s2=0;
        for(int i=0;i<n;i++){
            s1+=nums[i];
            s2= (long) nums[i] *nums[i];
        }
        long val1=s1-sn;
        long val2=s2-s2n;
        long val3=val2/val1;
        long x=(val1+val3)/2;
        long y=val3-x;
        return new int[]{(int)x,(int)y};
    }

}
