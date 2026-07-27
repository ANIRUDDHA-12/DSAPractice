public class MedianOfTwoSortedArrays {
    public double median(int [] arr1,int [] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        if(n1>n2) return median(arr2,arr1);
        int left=(n1+n2+1)/2;
        int low=0;
        int high=n1;
        int n=n1+n2;
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            if(mid1<n1) l1=arr1[mid1];
            if(mid2<n2) l2=arr2[mid2];
            if(mid1-1>=0) r1=arr1[mid1-1];
            if(mid2-1>=0) r2=arr2[mid2-1];
           if(l1<=r2 &&  l2<=r1){
               if(n1%2==1) return Math.max(l1,l2);
               return ((double) Math.max(l1,l2)+Math.min(r1,r2))/2.0;
           } else if (l1>r2) {
               high=mid1-1;

           }else low=mid1+1;
        }
        return 0.0;
    }
    public static void main(String [] args){
        MedianOfTwoSortedArrays m1=new MedianOfTwoSortedArrays();

        int [] n1= {7,12,14,15};
        int [] n2= {1,2,3,4,9,11};

        double answer1=m1.median(n1,n2);
        System.out.println("The answer to it is"+answer1);
    }
}
