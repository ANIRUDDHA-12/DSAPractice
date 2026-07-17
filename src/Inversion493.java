import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inversion493 {
    private int merge(int [] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int count=0;
        List<Integer> ans=new ArrayList<>();

        while(left<=mid && right<=high){
            if(arr[left]>2*(long)arr[right]){
                count+=mid-left+1;
                right++;
            }
            else{
                left++;
            }
        }
        left=low;
        right=mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                ans.add(arr[left]);
                left++;
            }else{
                ans.add(arr[right]);
                right++;
            }
        }
        return count;
    }
    private int mergeSort(int [] arr,int low,int high){
        if(low>=high) return 0;
        int mid=(low+high)/2;
        int count=0;
        count+=mergeSort(arr,low,mid);
        count+=mergeSort(arr,mid+1,high);
        count+=merge(arr,low,mid,high);
        return count;
    }
    public int inversionPairs(int [] nums){
        return mergeSort(nums,0,nums.length-1);
    }
    public static void main(String [] args){
        Inversion493 inversion493=new Inversion493();
        int [] test={8,4,2,1};
        System.out.println("the test for result 1 is "+ Arrays.toString(test));
        int result1=inversion493.inversionPairs(test);
        System.out.println(result1);

        int [] test2={3,2,2};
        System.out.println("the test for result 1 is "+ Arrays.toString(test2));
        int result2=inversion493.inversionPairs(test2);
        System.out.println(result2);

        int [] test3={1,2,3,4,5};
        System.out.println("the test for result 1 is "+ Arrays.toString(test3));
        int result3=inversion493.inversionPairs(test3);
        System.out.println(result3);
    }
}
