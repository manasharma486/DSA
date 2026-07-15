import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollisonLC735 {
    public static void main(String[] args) {
        int[] arr = {10,2,-5};
        int[] collison = collision(arr);

        System.out.println(Arrays.toString(collison));



    }
    private static int[] collision (int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && (arr[i] < 0) && stack.peek() >= 0 && (arr[i] * -1) > stack.peek()) {
                stack.pop();
            }

            if (!stack.isEmpty() && (arr[i] < 0) && stack.peek() >= 0 && (arr[i] * -1) < stack.peek()) {
                continue;
            }
            else if (!stack.isEmpty()&& ((arr[i] < 0) && stack.peek() >= 0) && ((arr[i] * -1) == stack.peek() || arr[i] == stack.peek() ) ) {
                stack.pop();
                continue;
            }

            stack.push(arr[i]);
        }

        
        if (stack.isEmpty()) {
            return new int[0];
        }

        int[] collison = new int[stack.size()];

        for (int i = 0; i < collison.length; i++) {
            collison[i] = stack.get(i);
        }

        return collison;
        
    }
}
