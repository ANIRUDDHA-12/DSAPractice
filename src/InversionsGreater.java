import java.util.ArrayList;
import java.util.List;

public class InversionsGreater {
    int merge(int [] nums,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        List<Integer> ans=new ArrayList<>();
        int count=0;
        while(left<=mid && right<=high){
            if(nums[left]> 2*(long)nums[right]){
                count+=mid-left+1;
                right++;
            }else{
                left++;
            }
        }
        left=low;
        right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                ans.add(nums[left]);
                left++;
            }
            else{
                ans.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            ans.add(nums[left]);
            left++;
        }
        while(right<=high){
            ans.add(nums[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=ans.get(i-low);
        }
        return count;
    }
    int mergeSort(int [] nums,int low ,int high){
        if(low>=high) return 0;
        int mid=(low+high)/2;
        int count=0;
        count+=mergeSort(nums,low,mid);
        count+=mergeSort(nums,mid+1,high);
        count+=merge(nums,low,mid,high);
        return count;
    }

    public int inversionsGreater(int [] nums){
        if(nums==null || nums.length==0) return 0;
        return mergeSort(nums,0,nums.length-1);
    }

    public static void main(String [] args){
        InversionsGreater solver=new InversionsGreater();

        int[] nums1 = {1, 3, 2, 3, 1};
        System.out.println("the output for it is"+solver.inversionsGreater(nums1));

        int[] nums2 = {2, 4, 3, 5, 1};
        System.out.println("the output for it is"+solver.inversionsGreater(nums2));

    }
}
