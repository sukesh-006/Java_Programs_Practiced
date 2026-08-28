import java.util.Stack;
public class EvaluatePostfix {
    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (String token : exp.split(" ")) {
            if (token.equals("+")) stack.push(stack.pop() + stack.pop());
            else if (token.equals("-")) { int b = stack.pop(), a = stack.pop(); stack.push(a - b); }
            else if (token.equals("*")) stack.push(stack.pop() * stack.pop());
            else if (token.equals("/")) { int b = stack.pop(), a = stack.pop(); stack.push(a / b); }
            else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println("Result: " + evaluate("2 3 1 * + 9 -"));
    }
}
