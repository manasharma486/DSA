import java.util.Arrays;
import java.util.Stack;
public class MaximumRectangleLC85 {
    public static void main(String[] args) {
        char[][] matrix = {
    {'1', '0', '1', '0', '0'},
    {'1', '0', '1', '1', '1'},
    {'1', '1', '1', '1', '1'},
    {'1', '0', '0', '1', '0'}};

    int [] histogram =  new int[matrix[0].length];

    int maxArea = 0;

    for (int i = 0; i < matrix.length; i++) {
        
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[i][j] == '1') {
                histogram[j] ++ ;
            }
            else {
                histogram[j] = 0;
            }
        }

        int[] nse = NSE(histogram);
        int[] pse = PSE(histogram);

        for (int j = 0; j < histogram.length; j++) {
            int area = ((nse[j] - pse[j])- 1) * histogram[j];

            maxArea = Math.max(maxArea, area);
        }

        
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
