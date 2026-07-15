import java.util.Stack;
public class SumOfSubArrayRangesLC2104 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        long ans = sumOfSubarray(arr, PME(arr), NME(arr)) -  sumOfSubarray(arr, PSE(arr), NSE(arr));

        System.out.println(ans);

    }

    private static long sumOfSubarray (int[] arr , int[] prvMe , int[] Nextme) {

        int[] pme = prvMe;
        int[] nme = Nextme;

        long total = 0;
      

        for (int i = 0; i < arr.length; i++) {
        long contribution = (long) (i - pme[i]) * (nme[i] - i) * arr[i];
        total = (total + contribution);
        }

        return  total;

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
