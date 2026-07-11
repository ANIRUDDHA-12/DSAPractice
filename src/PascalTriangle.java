public class PascalTriangle {
    public int pascalTriangle(int r,int c){
        if(c<=0 || c>r) return 0;
        if(c>(r+1)/2){
            c=r-c+1;
        }
        long ans=1;
        for(int i=1;i<c;i++){
            ans=ans*(r-i);
            ans=ans/i;
        }
        return (int) ans;
    }
}
