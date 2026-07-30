public class searchInMatrix1 {
    public boolean searchInMatrix(int [] [] mat,int target){
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(mat[row][col]==target){
                return true;
            }
            else if(mat[row][col]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
    return false;
    }
}
