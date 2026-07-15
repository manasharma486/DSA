import java.util.Stack;

public class RemoveKDigitsLC402 {
    public static void main(String[] args) {
        
        String nums = "112";
        System.out.println(RemoveDigits(nums, 1));
    }

    private static String RemoveDigits (String str , int k) {
        if (str.length() <= k ) {
            return "0";
        }

        int count = 0 ;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);

           
            while (!stack.isEmpty() && c < stack.peek() && count < k) {
                stack.pop();
                count ++ ;
            }

            if (stack.size() == 1 && stack.peek() == '0') {
                stack.pop();
            }   

            stack.push(c);
        }

        String ans = "";
        while (count < k && !stack.isEmpty()) {
            stack.pop();
            count++;
        }

        if (stack.isEmpty()) {
            return "0";
        }

        
        for (Character character : stack) {
            ans += character ;
        }
        return ans;
    }
}
