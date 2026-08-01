public class RotateString {
    public boolean rotateString(String s,String goal){
        if(s==null || s.length()==0) return false;

        String str=s+s;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(str.substring(i,i+n).contains(goal)) return true;
        }
        return false;
    }
}
