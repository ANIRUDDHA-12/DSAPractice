public class ParanThesisOuter {
    public String paranThesisOuter(String s){
        StringBuilder ans=new StringBuilder();
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(depth>0){
                    ans.append(c);
                }
                depth++;
            }else {
                depth--;
                if(depth>0){
                    ans.append(c);
                }
            }
        }
        return ans.toString();
    }
    public static void main(String [] args){
        ParanThesisOuter p=new ParanThesisOuter();
        String test="((()))";
        String ans=p.paranThesisOuter(test);
        System.out.println(ans);
    }
}
