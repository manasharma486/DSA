import java.util.Stack;

public class ValidParenthesisLC20 {
    
    public static void main(String[] args) {
        
        String s = "((" ;

        System.out.println(isValid(s));
    }

    private static boolean isValid(String s) {

        if (s.length() == 1) {
            return false;
        }

       
        Stack<Character> stack = new Stack<>();

       for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else {
                if (stack.isEmpty() ) {
                    return false ;
                }

                char pop = stack.pop();

            if ( ! (pop  == '{' && c == '}' || pop == '(' && c == ')' || pop == '['  && c == ']' ) ) {

                return false;
            }
       }

       
    
       
    }
    return stack.isEmpty() ; 
    }
}
