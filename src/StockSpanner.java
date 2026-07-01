import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StockSpanner {
    Stack<int[]> st = new Stack<>();
    public StockSpanner(){
        st=new Stack<>();
    }
    public int next(int price){
      int span=1;
      while(!st.isEmpty() && st.peek()[0] <=price){
          span = span+st.pop()[1];
      }
      st.push(new int[]{price,span});
      return span;
    }
}
