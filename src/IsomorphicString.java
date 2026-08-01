import java.util.HashMap;

public class IsomorphicString {
    public boolean isoMorphic(String s,String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> check=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original=s.charAt(i);
            char replacement=t.charAt(i);

            if(!check.containsKey(original)){
                if(!check.containsValue(replacement)){
                     check.put(original,replacement);
                }
                else{
                    return false;
                }
            }else{
                char get=check.get(original);
                if(get!=replacement){
                    return  false;
                }
            }
        }
        return true;
    }
    public static void main(String [] args){
        IsomorphicString s=new IsomorphicString();
        String test1="add";
        String num1="num";

        String test2="egg";

        System.out.println(s.isoMorphic(test1,num1));
        System.out.println(s.isoMorphic(test1,test2));
    }
}
