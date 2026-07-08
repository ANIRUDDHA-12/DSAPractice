public class NextPermutation {
    public void findNextPermutation(int [] nums){
        if(nums==null || nums.length==0) return ;

        int ind=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,n-1);

    }

    private void reverse(int [] nums,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    private void swap(int [] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }

    public static void main(String [] args){
       NextPermutation nextPermutation= new NextPermutation();

       int [] test= {1,2,3};
       nextPermutation.findNextPermutation(test);

       for(int num:test){
           System.out.println(num+" ,");
       }

    }
}
