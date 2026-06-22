import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stackk{
public static void main(String[] args) {
    
    String s = "([{}])";

    solution(s);

}

public static void solution(String s ){
    Map<Character,Character> map = new HashMap<>();
    map.put('(',')');
    map.put('{','}');
    map.put('[',']');

    Stack<Character> stack = new Stack<>();

    for(char c:s.toCharArray()){
        if(map.containsKey((c))){
            stack.push(map.get(c));
        }
        else{
            if(stack.empty() || stack.pop() != c)
            {
                System.out.println("Not valid paranthesis");return;
            }
        }
    }
    System.out.println(stack.empty()? "Valid" : "Not Valid");
}

}


