public class LargestOddNumber {
    public String oddCheck(String s){
       if(s== null || s.length()==0) return "";

       for(int i=s.length()-1;i>=0;i--){
           char c=s.charAt(i);

           if(c-'0'%2==0){
               return "";
           }else{
              return s.substring(0,i+1);
           }
       }
       return "";
    }
    public static void main(String [] args){
        LargestOddNumber l1=new LargestOddNumber();
        String test="561345692341";

        System.out.println(l1.oddCheck(test));
    }
}
