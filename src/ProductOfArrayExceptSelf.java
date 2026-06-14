//public class ProductOfArrayExceptSelf{
//    public static int[] findProduct(int [] nums){
//        int n = nums.length;
//        int [] arr = new int[n];
//
//        for(int i =0;i<n;i++){
//            int currentProduct=1;
//
//            for(int j=0;j<n;j++){
//                if(i!=j){
//                    currentProduct*=nums[j];
//                }
//            }
//            arr[i]=currentProduct;
//        }
//        return arr;
//    }
//}

public class ProductOfArrayExceptSelf {
public static int[] findProduct(int [] nums){
    int n= nums.length;
    int [] ans=new int[n];
    ans[0]=1;
    for(int i =1;i<nums.length;i++){
        ans[i]=ans[i-1]*nums[i-1];
    }
    int R = 1;
    for(int j=n-1;j>=0;j--){
        ans[j]=ans[j]*R;
        R=R*nums[j];

    }
    return ans;
}
}