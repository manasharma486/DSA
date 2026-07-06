import java.util.Stack;

public class PrefixToPostFix {
    public static void main(String[] args) {
        
        String prefix = "*+ab-cd" ;

        System.out.println(postfix(prefix));
    }

    private static String postfix(String prefix) {
        String s = reverse (prefix);

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c>= '0' && c <= '9') {
                stack.push(String.valueOf(c));
            }

            else if (!stack.isEmpty() && stack.size() >= 2) {
                String s1 = stack.pop();
                String s2 = stack.pop();

                String ans = s1 + s2 + c ;

                stack.push(ans);
            }
        }

        return stack.pop();
    }


    private static String reverse (String str) {

        String ans = "" ;
        for (int i = str.length() -1 ; i >= 0 ; i--) {

            if (str.charAt(i) == '(') {
                
                ans+= ')';
            }
            
            else if (str.charAt(i) == ')') {
                ans += '(' ;
            }

            else {
                ans+= str.charAt(i);
            }
        }

        return ans;
    }
}
