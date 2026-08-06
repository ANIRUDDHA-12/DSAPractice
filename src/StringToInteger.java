public class StringToInteger {
    public int stringToInteger(String s){
        if(s== null || s.length()==0){
            return 0;
        }
        int base=0;
        int sign=1;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()) return 0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        if(s.charAt(i)== '+' || s.charAt(i)=='-'){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
       while(i<s.length() && Character.isDigit(s.charAt(i))){
           int digit=s.charAt(i)-'0';
           if(base>max/10 || base==max/10 && digit>7){
              return (sign==1)?max:min;
           }
           base=base*10+digit;
           i++;

       }
       return base*sign;
    }
    public static void main(String [] args){
        StringToInteger t1=new StringToInteger();
        String test=" -123459";
        System.out.println(t1.stringToInteger(test));
    }
}
