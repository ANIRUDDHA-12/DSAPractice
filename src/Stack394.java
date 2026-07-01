import java.util.Stack;
public class Stack394 {
    // public String decodeString(String s) {
    //  Stack<Integer> numStack=new Stack<>();
    //  Stack<Character> charStack = new Stack<>();
    //  int k=0;

    //  for (char c:s.toCharArray()){
    //     if(Character.isDigit(c)){
    //         k=k*10+(c-'0');
    //     }
    //     else if(c=='['){
    //         numStack.push(k);
    //         k=0;
    //         charStack.push(c);
    //     }
    //     else if(Character.isLetter(c)){
    //         charStack.push(c);
    //     }
    //      if(c==']'){
    //         StringBuilder sb= new StringBuilder();
    //         while(charStack.peek()!='[' ){
    //             sb.insert(0,charStack.pop());
    //         }
    //         charStack.pop();
    //         int times = numStack.pop();
    //         String inner = sb.toString();
    //         StringBuilder multiplied = new StringBuilder();
    //         for(int i=0;i<times;i++){
    //             multiplied.append(inner);
    //         }
    //          for (char ch : multiplied.toString().toCharArray()) {
    //                 charStack.push(ch);
    //         }
    //     }
    //  }
    //  StringBuilder result = new StringBuilder();
    //  while(!charStack.isEmpty()){
    //     result.insert(0,charStack.pop());
    //  }
    //  return result.toString();
    // }

    public String decodeString(String s){
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k=0;

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(Character.isLetter(c)){
                currentString.append(c);
            }
            else if(c=='['){
                numStack.push(k);
                stringStack.push(currentString);
                k=0;
                currentString = new StringBuilder();
            }
            else {
                int times=numStack.pop();
                StringBuilder prevString = stringStack.pop();
                for(int i =0;i<times;i++){
                    prevString.append(currentString);
                }
                currentString = prevString;
            }
        }
        return currentString.toString();
    }
}
