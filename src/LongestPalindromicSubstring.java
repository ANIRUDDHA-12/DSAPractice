public class LongestPalindromicSubstring {
    public int getLongestLength(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindromicSubstring(String s){
        if(s==null || s.length()==0) return "";
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1=getLongestLength(s,i,i);
            int len2=getLongestLength(s,i,i+1);
            int currentLength=Math.max(len1,len2);
            if(currentLength>end){
                end=currentLength;
                start=i-(currentLength-1)/2;
            }
        }
        return s.substring(start,start+end);
    }
    public static void main(String [] args){
        LongestPalindromicSubstring l1=new LongestPalindromicSubstring();
        String test="badbsbafhfv";
        System.out.println(l1.longestPalindromicSubstring(test));
    }
}
