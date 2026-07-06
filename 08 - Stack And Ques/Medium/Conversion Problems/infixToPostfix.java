import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class infixToPostfix {
    
    public static void main(String[] args) {
        
        String infix = " (p + q) * (m - n) ";

        System.out.println(postFix(infix));

    }

    private static String postFix (String s) {
        Map<Character , Integer> priorityMap = new HashMap<>();
        String ans = "" ;
        Stack<Character> stack = new Stack<>();
        
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
                ans += c;
            }

            else {
                if (stack.isEmpty()) {
                    stack.push(c);
                }

                else {
                    if (priorityMap.get(c) > priorityMap.get(stack.peek()) ) {
                        stack.push(c);
                    }

                    else if (c == '('){
                        stack.push(c);
                    }

                    else if (c == ')') {

                        while (!stack.isEmpty() && stack.peek() != '(') {
                            ans+= stack.pop();
                        }

                        stack.pop();
                        

                    }

                    else if (priorityMap.get(c) <= priorityMap.get(stack.peek()) ){

                        if (c == '^' && priorityMap.get(c) == priorityMap.get(stack.peek())) {

                            stack.push(c);

                            continue;
                        }

                        while (!stack.isEmpty() &&  priorityMap.get(stack.peek()) >= priorityMap.get(c)  ) {
                            ans+= stack.pop();
                        }

                        stack.push(c);

                      
                    }
                }
            }
        }

        while (!stack.isEmpty()) {
            ans+= stack.pop();
        }
        return ans;
    }
}
