import java.util.Stack;

public class Sum739 {
    public int[] dailyTemperatures(int[] temperatures) {
    int [] result = new int[temperatures.length];

//    for(int i=0;i<temperatures.length;i++){
//        for(int j=i+1;j<temperatures.length;j++){
//            if(temperatures[j]>temperatures[i]){
//                result[i]+=j-i;
//                break;
//            }
//        }
//    }

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i]=stack.peek()-1;
            }
        }
    return result;
    }
}