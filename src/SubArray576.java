import java.util.HashMap;
import java.util.Map;

public class SubArray576 {
    public int subArraySum(int [] nums,int k){
        int count=0;
        int currentSum=0;
        Map<Integer,Integer> map=new HashMap<>();
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
