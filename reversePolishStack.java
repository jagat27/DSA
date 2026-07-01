import java.util.Stack;

public class reversePolishStack {
    public int evalRPN(String[] tokens) {


        Stack<String> stack = new Stack<>();

        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                int result = 0;
                switch(token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }
                stack.push(String.valueOf(result));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());


    
}

}
