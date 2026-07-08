import java.util.HashSet;
import java.util.Set;

public class LongestCommonSequence {
    public int longestSequence(int [] nums){
        int longestLength=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for (int num:set){
            if(!set.contains(num-1)){
              int currentLength=1;
              while(set.contains(num+currentLength)){
                  currentLength++;
              }
                longestLength=Math.max(currentLength,longestLength);
            }

        }
        return longestLength;
    }

    public static void main(String [] args){
        LongestCommonSequence lcs=new LongestCommonSequence();

        int [] test= {100,4,200,1,2,3};
        int result= lcs.longestSequence(test);

        System.out.println("The result is "+result);
    }
}
