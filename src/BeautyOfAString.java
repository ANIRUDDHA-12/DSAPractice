import java.util.HashMap;

public class BeautyOfAString {
    public int beautyOfString(String s){
        if(s==null || s.length()==0) return 0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> freq=new HashMap<>();
            for(int j=i;j<s.length();j++){
                freq.put(s.charAt(j),freq.getOrDefault(s.charAt(j),0)+1);

                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int count:freq.values()){
                    max=Math.max(max,count);
                    min=Math.min(min,count);
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
    public static void main (String [] args){
        BeautyOfAString b1=new BeautyOfAString();
        String test="xyx";
        System.out.println(b1.beautyOfString(test));
    }
}
