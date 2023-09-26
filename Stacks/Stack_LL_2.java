import java.util.Stack;
//in case of util.* my vs code throwing error ........so i used Stack instead of * suggested by chatgpt

//stack by LL using java collection framework
public class Stack_LL_2 {
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
