import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String prefix = "+ab";

        System.out.println(infix(prefix));
    }

    private static String infix(String s) {

        String lol = reverse(s);
        
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < lol.length(); i++) {
            Character c = lol.charAt(i);

            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                stack.push(String.valueOf(c));
            }

            else if (!stack.isEmpty() && stack.size() >= 2) {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String ans = "( " + s1 + " " + c + " " + s2 + " )";

                stack.push(ans);
            }
        }

        return stack.pop();
    }

    private static String reverse (String s) {
        String ans = "" ;

        for (int i = s.length() - 1; i >= 0; i--) {
            Character c = s.charAt(i);
            if (c == ')') {
                ans+= '(' ;
            }

            else if (c == '(') {
                ans+= ')';
            }

            else {
                ans+= c ;
            }
        }

        return ans;
    }
}
