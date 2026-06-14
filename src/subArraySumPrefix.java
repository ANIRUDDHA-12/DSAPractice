//public class subArraySumPrefix {
//    public int subarraySum(int[] nums, int k){
//        int count =0;
//        for(int i=0;i<nums.length;i++){
//            int currentSum=0;
//
//            for(int j=i;j< nums.length;j++){
//                currentSum+=nums[j];
//
//                if(currentSum==k){
//                    count++;
//                }
//            }
//
//        }
//        return count;
//    }
//}

import java.util.HashMap;

public class subArraySumPrefix {
    public int subarraySum(int[] nums,int k){
        int count =0;
        int currentSum=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
           currentSum+=nums[i];
          int target=currentSum-k;
          if(map.containsKey(target)){
              count+=map.get(target);
          }
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}