public class ReverseWords186 {
    public String reverse(String s){
        if(s==null || s.length()==0) return " ";
        int n=s.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<=n){
            while(i<n && s.charAt(i)==' '){
                sb.append(s.charAt(i));
                i++;
            }
            if(i>=n) break;
            int start=i;
            while(i<n && s.charAt(i)!=' '){
                i++;
            }
            int end=i-1;
            String word=s.substring(start,end+1);
            if(word.length()%2==0){
                sb.append(new StringBuilder(word).reverse());
            }
            else{
                sb.append(word);
            }
        }
        return sb.toString();
    }
    public static void main(String [] args){
        ReverseWords186 words=new ReverseWords186();
        String test="as gu hb fj gjs";
        String ans= words.reverse(test);
        System.out.println(ans);
    }
}
