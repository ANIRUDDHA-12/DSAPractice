public class MinimumDivisor {
    int maxElement(int [] arr){
        int element=Integer.MIN_VALUE;
        for(int num:arr){
            element=Math.max(element,num);
        }
        return element;
    }
    int minimumNumber(int [] arr,int num){
        int div=0;
        for(int digit:arr){
            div+=(digit+num+1)/num;
        }
        return div;
    }
    public int minimumDivisor(int [] arr,int limit){
        int low=1;
        int high=maxElement(arr);
        int ans=high;
        while (low<=high){
            int mid=low+(high-low)/2;
            int divisor=minimumNumber(arr,mid);
            if(divisor<=limit){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
