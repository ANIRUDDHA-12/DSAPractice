public class Celebrity277 {
    public int celebrity(int [][] matrix){
        int n = mat.length;
        int top = 0;
        int down = n - 1;

        while (top<down){
            if(matrix[top][down] ==1){
                top++;
            }
            else{
                down--;
            }
        }
        int suspect=top;
        for(int i=0;i<n;i++){
            if(i==suspect)continue;
            if(matrix[suspect][i]==1 || matrix[i][suspect]==0){
                return -1;
            }
        }
        return suspect;
    }
}
