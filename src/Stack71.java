import java.util.Stack;
class Stack71 {
    public String simplifyPath(String path) {
        String [] directory= path.split("/");
        Stack<String> stack = new Stack<>();

        for(String dir:directory){
            if(dir.equals("") || dir.equals("."))continue;
            if(dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(dir);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder sb= new StringBuilder();
        for(String folder:stack){
            sb.append("/");
            sb.append(folder);
        }
        return sb.toString();
    }
}