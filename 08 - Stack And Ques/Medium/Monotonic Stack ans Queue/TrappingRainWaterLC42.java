import java.util.Stack;
public class TrappingRainWaterLC42 {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
        int[] nse = NSE(arr);
        int[] nge = NGE(arr);

        int water = 0 ;

        for (int i = 0; i < nge.length; i++) {
            water += nge[i] - nse[i];
        }
        
        System.out.println(water);
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

private static int[] NGE(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i <= 0; i--) {
            while (!stack.isEmpty() && arr[i] < stack.peek()) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nge[i] = -1;
            }
            else if (stack.peek() > arr[i]) {
                nge[i] = stack.peek();
            }

            stack.push(arr[i]);
    }

    return nge;


}





}
