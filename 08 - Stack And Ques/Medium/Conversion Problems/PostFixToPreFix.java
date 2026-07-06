import java.util.Stack;

public class PostFixToPreFix {
    public static void main(String[] args) {
        String postfix = "abc*+d-";

        System.out.println(prefix(postfix));
    }

    private static String prefix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {

            Character c = postfix.charAt(i);

            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c>= '0' && c <= '9') {
                stack.push(String.valueOf(c));
            }

            else if (!stack.isEmpty() && stack.size() >= 2) {
                String s1 = stack.pop();
                String s2 = stack.pop();

                String ans = c  + s2 + s1;
                
                stack.push(ans);
            }
            
        }


        return stack.pop();
    }
}
