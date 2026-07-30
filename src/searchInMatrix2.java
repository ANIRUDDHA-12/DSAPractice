public class searchInMatrix2 {
    int upperBound(int [] row,int m ,int x){
        int low=0;
        int high=m-1;
        int ans=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(row[mid]>x){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
    int searchLowerElements(int [][] matrix,int n,int m,int mid){
        int count=0;
        for(int i=0;i<n;i++){
            count+=upperBound(matrix[i],m, mid);
        }
        return count;
    }
    public boolean searchInMatrix2(int [][] matrix,int target){
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            low=Math.max(low,matrix[i][0]);
            high=Math.min(high,matrix[i][m-1]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int smallElements=searchLowerElements(matrix,n,m,mid);
            int req=(n*m)/2;
            if(smallElements<=req){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
