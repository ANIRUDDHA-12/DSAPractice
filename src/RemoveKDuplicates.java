public class RemoveKDuplicates {
    public String removeDuplicates(String s,int k){
        int [] countStack = new int[s.length()];
        char [] charStack = new char[s.length()];
        int top=-1;

        for(char c:s.toCharArray()){
            top++;
            charStack[top]=c;
            if(top==0){
                countStack[top]=1;
            } else if (charStack[top]==charStack[top-1]) {
                countStack[top]=countStack[top-1]+1;
            }
            else{
                countStack[top]=1;
            }
            if(countStack[top]==k) {
                top -= k;
            }
        }
        return new String(charStack,0,top+1);
    }
}
