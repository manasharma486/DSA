import java.util.Stack;

public class NextGreaterElement {
    
    public static void main(String[] args) {
        
        Integer[] arr = {4,2,3};
        Integer[] nge = nextGreaterArr(arr);

        for (Integer integer : nge) {
            System.out.print(integer + " ");
        }
    }

    private static Integer[] nextGreaterArr(Integer[] arr) {
        Integer[] nge = new Integer[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >=0 ; i--) {
            if (stack.isEmpty()) {
                nge[i] = -1;
                stack.push(arr[i]);
            }

            else if (stack.peek() > arr[i]) {
                nge[i] = stack.peek();

                stack.push(arr[i]);
            }

            else {
                while (!stack.isEmpty() && stack.peek() < arr[i]) {
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    nge[i] = -1;
                }
                else {
                    nge[i] = stack.peek();
                }

                stack.push(arr[i]);
            }
        }

        return nge;
    }
}
