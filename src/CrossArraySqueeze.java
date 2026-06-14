public class CrossArraySqueeze{
    public static void main(String args[]){
        int[] shipA = {10, 20, 30, 40};
        int[] shipB = {5, 15, 25, 35, 45};
        int target = 45;

        int ptrA=0;
        int ptrB= shipB.length-1;

        while(ptrA<ptrB){
            int sum= shipA[ptrA]+shipB[ptrB];
            if(sum== target){
                System.out.println("The target is "+shipA[ptrA]+" "+shipB[ptrB]);
                return ;
            }
            else if(sum<target){
                ptrA++;
            }else{
                ptrB--;
            }
        }
        System.out.println("NO Match Found");
    }
}