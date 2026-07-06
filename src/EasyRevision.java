import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

 class SomeWhat {
    public int findMax(int [] nums){
        int max=nums[0];
        if(nums==null || nums.length==0) return -1;
        for(int num:nums){
            max=Math.max(max,num);
        }
        return max;
    }
    public int secondMax(int [] nums){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        if(nums==null || nums.length<2) return -1;
        for(int num:nums){
            if(num>max){
                secondMax=max;
                max=num;
            } else if (num>secondMax && num<max) {
                secondMax=num;

            }
        }
        return (secondMax==Integer.MIN_VALUE)?-1:secondMax;
    }

    public boolean isSorted(int [] nums){
        if(nums==null || nums.length==1) return true;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public int removeDuplicates(int [] nums){
        if(nums==null || nums.length<=2)return 0;
        int write=1;
        for(int read=1;read<nums.length-1;read++){
            if(nums[read]!=nums[read-1]){
                nums[write]=nums[read];
                write++;
            }
        }
        return write;
    }
    public void rotateByOne(int [] nums){
        if(nums==null || nums.length==0) return ;
        int ind=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=ind;
    }

    public void rotateArray(int [] nums,int k){
        k=k% nums.length;
        reverseArr(0, nums.length -1,nums);
        reverseArr(0,k-1,nums);
        reverseArr(k,nums.length-1,nums);

    }
    public void reverseArr(int start,int end ,int[]nums){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public void shiftZeroes(int [] nums){
        if(nums==null || nums.length==0) return;

        int left=0;
        for(int right=0;right< nums.length;right++){
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
        }
        for(int i=left;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public int [] unionArrays(int [] nums1 ,int [] nums2){
        int ptrA=0;
        int ptrB=0;
        ArrayList<Integer> vipList=new ArrayList<>();
        while(ptrA< nums1.length && ptrB< nums2.length){
            if(nums1[ptrA]<nums2[ptrB]){
                if(vipList.size()==0 || vipList.get(vipList.size()-1)!=nums1[ptrA]){
                    vipList.add(nums1[ptrA]);
                }
                ptrA++;
            } else if (nums1[ptrA]==nums2[ptrB]) {
                if(vipList.size()==0 || vipList.get(vipList.size()-1)!=nums1[ptrA]){
                    vipList.add(nums1[ptrA]);
                }
                ptrA++;
                ptrB++;
            }
            else{
                if(vipList.size()==0 || vipList.get(vipList.size()-1)!=nums2[ptrB]){
                    vipList.add(nums2[ptrB]);
                }
                ptrB++;
            }
        }
        while (ptrA<nums1.length){
            if(vipList.size()==0 || vipList.get(vipList.size()-1)!=nums1[ptrA]){
                vipList.add(nums1[ptrA]);
            }
            ptrA++;
        }
        while(ptrB<nums2.length){
            if(vipList.size()==0 || vipList.get(vipList.size()-1)!=nums1[ptrA]){
                vipList.add(nums1[ptrA]);
            }
            ptrB++;
        }
        int [] result=new int[vipList.size()];
        for(int i=0;i<vipList.size();i++){
            result[i]=vipList.get(i);
        }
        return result;
    }

    public int findMissingNumber(int [] nums){
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }

    public int findSingleNumber(int [] nums){
        if(nums==null || nums.length==0) return -1;
        int result=0;
        for(int num:nums){
            result=result^num;
        }
       return result;
    }

    public int maximumOnes(int [] nums){
        int max=0;
        int currentCount=0;
        if(nums==null || nums.length==0) return -1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==1){
                currentCount++;

                if(currentCount>max){
                    max=currentCount;
                }
            }else{
                currentCount=0;
            }
        }
        return max;
    }
    public int longestSubarray(int [] nums,int k){
        int currentSum=0;
        int maxLength=0;
        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            currentSum+=nums[i];
            int target=currentSum-k;

            if(map.containsKey(target)){
                int currentLength=i-map.get(target);
                maxLength=Math.max(currentLength,maxLength);
            }
            if(!map.containsKey(currentSum)){
                map.put(currentSum,i);
            }
        }
        return maxLength;
    }
}

public class EasyRevision {
     public static void main(String [] args){
         SomeWhat some=new SomeWhat();
         int [] nums1={10, 5, 2, 7, 1, 9};
         int k1=15;
                 System.out.println("The result is"+some.longestSubarray(nums1,k1));
     }
}

