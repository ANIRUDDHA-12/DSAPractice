import java.util.Arrays;

public class TwoPointerInPlace {
    public static void main(String args[]){
        int[] line = {15, 22, 9, 18, 30, 12};


        int left=0;


        for(int right=0;right< line.length;right++){
            if(line[right]>=18){
                line[left]=line[right];
                left++;
            }
        }
        for(int i=left;i<line.length;i++){
            line[i]=-1;
        }

        System.out.println("The range can be"+Arrays.toString(line));
    }
}