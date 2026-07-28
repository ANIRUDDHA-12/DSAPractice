public class KthElementOfTwoSortedArray {
    public int KthElement(int [] a,int [] b,int k){
        int n1=a.length;
        int n2=b.length;
        if(n1>n2) return KthElement(b,a,k);
        int left=k;
        int low=Math.max(0,k-n2);
        int high=Math.max(n1,k);
        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            if(mid1<n1) r1=a[mid1];
            if(mid2<n2) r2=b[mid2];
            if(mid1-1>=0) l1=a[mid1-1];
            if(mid2-1>=0) l2=b[mid2-1];
            if(l1<=r2 && l2<=r1){
                return (Math.max(l1,l2));
            } else if (l1>r2) {
                low=mid1+1;
            }else high=mid1-1;
        }
        return 0;
    }
    public static void main(String [] args){
        KthElementOfTwoSortedArray k=new KthElementOfTwoSortedArray();

        int [] n1={2, 3, 6, 7, 9};
        int [] n2={1, 4, 8, 10};
        int y=5;

        int answer=k.KthElement(n1,n2,y);
        System.out.println(answer);
    }
}
