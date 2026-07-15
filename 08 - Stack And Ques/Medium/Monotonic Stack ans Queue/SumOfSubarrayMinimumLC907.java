import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayMinimumLC907 {
    public static void main(String[] args) {
        int[] arr = {11,81,94,43,3};
        int[] nse = NSE(arr);
        int[] pse = PSE(arr);
        int total = 0;
        int mod = (int) (1e9 + 7);

        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i ;

            total+= ((left*right * (long) 1 * arr[i])%mod)%mod;
            
        }

        System.out.println(total);
    }

    private static int[] NSE (int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nse = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nse[i] = arr.length;
            }

            else {
                nse[i] = stack.peek();
            }

            stack.push(i);
        }

        return nse;
    }

    private static int[] PSE (int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                pse[i] = -1;
            }
            else {
                pse[i] = stack.peek();
            }

            stack.push(i);
        }

        return pse;
    }
}

