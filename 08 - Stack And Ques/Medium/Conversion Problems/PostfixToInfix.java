import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String s = "ab+c";

        System.out.println(infix(s));
    }

    private static String infix(String s) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            
            if (c >= 'a' && c <= 'z' || c >= 'A' &&  c <= 'Z' || c >= '1' && c <= '9' ) {
                stack.push(String.valueOf(c));
            }

            else {
                if (!stack.isEmpty() && stack.size() >= 2) {
                    String ans = "( " ;
                    String s1 = stack.pop();
                    String s2 = stack.pop();

                    ans+= s2 + " " + c + " " +s1 + " )" ;

                    stack.push(ans);

                    
                }

            }
        }

        while(stack.size() >1) {
            String ans = "( " ;
                    String s1 = stack.pop();
                    String s2 = stack.pop();

                    ans+= s2 + " * " +s1 + " )" ;

                    stack.push(ans);
        }

        return stack.pop();
    }


   
}
