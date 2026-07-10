import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralPrint {
    public List<Integer> spiralPrint(int [][] matrix){
        List<Integer> ans= new ArrayList<>();
        if(matrix==null || matrix.length==0) return ans;

        int top=0;
        int right=matrix[0].length;
        int left=0;
        int bottom= matrix.length;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
            }
        }
        return ans;
    }
}
