

public class ReverseWords151 {
    public String reverseWords151(String s){
        int i=s.length()-1;
        StringBuilder ans=new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            if(ans.length()>0){
                ans.append(' ');
            }
            ans.append(s.substring(i+1,j+1));
        }
        return ans.toString();
    }
    public static void main(String [] args){
        ReverseWords151 words151=new ReverseWords151();
        String words=" Welcome To the Jungle ";
        String answer=words151.reverseWords151(words);
        System.out.println(answer);
    }
}
