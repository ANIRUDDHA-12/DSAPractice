class SplitArray410 {
    int maxElement(int [] nums){
        int element=0;
        for(int num:nums){
            element=Math.max(element,num);
        }
        return element;
    }
    int sumElement(int [] nums){
        int element=0;
        for(int num:nums){
            element+=num;
        }
        return element;
    }
    int countStudents(int [] nums,int pages){
        int student=1;
        int page=0;
        for(int i=0;i<nums.length;i++){
            if(page+nums[i]<=pages) {page+=nums[i];}
            else{
                student++;
                page=nums[i];
            }
        }
        return student;
    }
    int findPages(int [] nums,int n,int m){
        if(m>n) return -1;
        int low=maxElement(nums);
        int high=sumElement(nums);
        while(low<=high){
            int mid=low+(high-low)/2;
            int students=countStudents(nums,mid);
            if(students>m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    public int splitArray(int[] nums, int k) {
        return findPages(nums,nums.length,k);
    }
}