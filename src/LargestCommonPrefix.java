public class LargestCommonPrefix {
    public String longestCommon(String [] str){
        String prefix=str[0];
        int n= str.length;
        for(int i=1;i<n;i++){
            while(str[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String [] args){
        LargestCommonPrefix s=new LargestCommonPrefix();
        String [] test={"flaower","flyowery","float","flat"};
        System.out.println(s.longestCommon(test));
    }
}
