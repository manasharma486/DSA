import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1LC496 {
    public static void main(String[] args) {
        Integer[] nums1 = {2,4};
        Integer[] nums2 = {1,2,3,4};

        Integer[] nge = NGE(nums1 , nums2);

        for (Integer integer : nge) {
            System.out.print(integer + " ");
        }
    }

    private static Integer[] NGE (Integer[] nums1 , Integer[] nums2) {
        Integer[] nge2 = new Integer[nums2.length];
        Integer[] nge1 = new Integer[nums1.length];
        Map<Integer , Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], i);
        }

        for (int i = nums2.length-1 ; i >= 0 ; i--) {

            if (map.containsKey(nums2[i])) {
                map.put(nums2[i], i);
            }

            if (stack.isEmpty()) {
                nge2[i] = -1;
                stack.push(nums2[i]);
            }

            else if (stack.peek() > nums2[i]) {
                nge2[i] = stack.peek();
                stack.push(nums2[i]);
            }
            else {
                while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    nge2[i] = -1;
                }
                else {
                    nge2[i] = stack.peek();
                }

                stack.push(nums2[i]);
            }

        }

        for (int i = 0; i < nums1.length; i++) {
            int index = map.get(nums1[i]);
            nge1[i] = nge2[index];
        }




        return nge1;
    }
}
