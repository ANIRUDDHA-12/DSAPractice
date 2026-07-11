import java.util.ArrayList;
import java.util.List;

public class PascalTrianglePrint {

    public List<Integer> generateRows(int row){
        long ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add((int)ans);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ansRow=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ansRow.add(generateRows(i));
        }
        return ansRow;
    }

    public static void main(String [] args){
        PascalTrianglePrint pascalTriangle =new PascalTrianglePrint();
        int numRows=5;

        List<List<Integer>> answer=pascalTriangle.generate(5);
        System.out.println("The answer is "+numRows);
        for(List<Integer> num:answer){
            for(int row:num){
                System.out.println(row+" ");
            }
            System.out.println();
        }

    }
}
