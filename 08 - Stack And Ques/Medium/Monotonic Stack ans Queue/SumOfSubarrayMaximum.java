import java.util.Arrays;
import java.util.Stack;

public class SumOfSubarrayMaximum {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] pme = PME(arr);
        int[] nme = NME(arr);

        long total = 0;
int mod = (int) (1e9 + 7);

for (int i = 0; i < arr.length; i++) {
    int left = i - pme[i];
    int right = nme[i] - i;

    long contribution = ((long) left * right * arr[i]) % mod;
    total = (total + contribution) % mod;
}

System.out.println(total);
    }

    private static int[] PME(int[] arr) {
        int[] pme = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < pme.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                pme[i] = -1;
            }
            else {
                pme[i] = stack.peek();
            }

            stack.push(i);

        }

        return pme;
    }
    private static int[] NME (int[] arr) {
        int[] nme = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0 ; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }

            nme[i] = stack.isEmpty() ? arr.length : stack.peek();

            stack.push(i);
        }
        return nme;
    }
}
