import java.util.ArrayList;
import java.util.List;

public class Majority229 {
    public List<Integer> majorityElement(int [] nums){
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && element2!=nums[i]){
                count1=1;
                element1=nums[i];
            } else if (count2==0 && element1!=nums[i]) {
                count2=1;
                element2=nums[i];
            } else if (element1==nums[i]) {
                count1++;
            } else if (element2==nums[i]) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        List<Integer> answer=new ArrayList<>();
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(element1==nums[i]) count1++;
            if(element2==nums[i]) count2++;
        }
        int min= (nums.length)/3+1;
        if(count1>=min) answer.add(element1);
        if(count2>=min) answer.add(element2);
        return answer;
    }
}
