import java.util.Arrays;
import java.util.Stack;

public class LargestHistogramLC84 {
    public static void main(String[] args) {
        int[] arr = {2,2,2};
        int[] nse = NSE(arr);
        int[] pse = PSE(arr);

        int maxArea = 0;

        for (int i = 0; i < arr.length; i++) {
            
            int area = ((nse[i] - pse[i])-1 ) * arr[i];

            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea);
    }

    private static int[] NSE(int [] arr) {
        int nse[] = new int[arr.length];
        Stack <Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            nse[i] = (stack.isEmpty()) ? arr.length : stack.peek();

            stack.push(i);

        }
        return nse;
    }

    private static int[] PSE(int [] arr) {
        int pse[] = new int[arr.length];
        Stack <Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }

            pse[i] = (stack.isEmpty()) ? -1 : stack.peek();

            stack.push(i);

        }
        return pse;
    }
}
