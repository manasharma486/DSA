import java.util.Stack;

public class NextGreaterElement2LC503 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3};
        int[] nge = ngeLoop(arr);
        
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i] + " ");
        }
    }

    private static int[] ngeLoop(int[] arr) {
        int[] nge = new int[arr.length];
        Stack <Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            
            if (stack.isEmpty()) {
                stack.push(arr[i]);
                nge[i] = -1 ;
            }

            else {
                if (stack.peek() >= arr[i]) {
                    nge[i] = stack.peek();
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
                }

                stack.push(arr[i]);
            }
        }

        int num = arr[arr.length - 1];

        for (int i : arr ) {
            if (i > num) {
                nge[nge.length - 1] = i ;

                break;
            }
        }
        return nge;
    }


}