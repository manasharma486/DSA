import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        int[] nse = NSE(arr);
        
        System.out.println(Arrays.toString(nse));
    }

    private static int[] NSE(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] < stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nse[i] = -1;
            }
            else if (stack.peek() < arr[i]) {
                nse[i] = stack.peek();
            }

            stack.push(arr[i]);
    }

    return nse;

}

}
