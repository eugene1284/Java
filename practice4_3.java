import java.util.Stack;

public class practice4_3 {

    public static void main(String[] args) {
        String bStr1 = "()";
        String bStr2 = "(]";
        String bStr3 = "{}";
        String bStr4 = "{[([])]}";
        String bStr5 = "{}[]()";
        System.out.println(isValid(bStr4));

    }
    

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char top = stack.peek();
                if ((c == '}' && top == '{') ||
                        (c == ']' && top == '[') ||
                        (c == ')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}