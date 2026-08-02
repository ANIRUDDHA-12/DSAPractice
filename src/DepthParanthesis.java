public class DepthParanthesis {
    public int MaximumDepth(String s){
        int ans=0;
        int p=0;
        for(char c:s.toCharArray()){
            if(c=='(')p++;
            else if (c==')') {
                p--;
            }
            else {
                ans=Math.max(ans,p);
            }
        }
        return ans;
    }
}
