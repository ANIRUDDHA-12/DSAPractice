public class SquareRootAndNthRoot {
    public int findSqaure(int m){
        if(m==0 || m==1 )return m;
        int low=1;
        int high=m;
        int ans=1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid<=m){
               ans=mid;
               low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    public int findRoot(int mid,int n,int m){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*mid;
            if(ans>m) return 2;
        }
        if(ans==m) return 1;
        return 0;
    }

    public int findNthRoot(int n,int m){
        int low=1;
        int high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            int midN=findRoot(mid,n,m);
            if(midN==1){
                return mid;
            } else if (midN==0) {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
