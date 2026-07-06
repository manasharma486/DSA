import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args) {
        String inFix = " x + y * z / w + u";


        
        System.out.println(preFix(inFix));
        
    }

    private static String preFix (String s) {
        String ans = "" ;
        s = reverse(s);

        Stack<Character> stack = new Stack<>();
        Map<Character , Integer> priorityMap = new HashMap<>();

        priorityMap.put('^' , 3);
        priorityMap.put('+' , 1);
        priorityMap.put('-' , 1);
        priorityMap.put('*' , 2);
        priorityMap.put('/' , 2);
        priorityMap.put('(' , -1);
        priorityMap.put(')' , -1);
        

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i); 

            if (c == ' ') {
                continue;
            }
            
           else if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9') {
                ans += c ;
            }

            else {

                if (stack.isEmpty())  {
                    stack.push(c) ;
                }

                

                else if (c == '(') {
                    stack.push(c);
                }

                else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        ans+= stack.pop();
                    }

                    stack.pop();
                }

                else if (c == '^') {

                    while (!stack.isEmpty() && priorityMap.get(c) <= priorityMap.get(stack.peek())) {
                        ans+= stack.pop();
                    }

                    stack.push(c);
                }

                else if (priorityMap.get(c) < priorityMap.get(stack.peek())) {

                    while (!stack.isEmpty() && priorityMap.get(stack.peek()) > priorityMap.get(c)) {
                        ans += stack.pop();
                    }

                    stack.push(c);
                }

                else if (priorityMap.get(c) >= priorityMap.get(stack.peek())) {
                    stack.push(c);
                }
            }
        }

        while (!stack.isEmpty()) {
            ans+= stack.pop();
        }

        return reverse(ans);
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
