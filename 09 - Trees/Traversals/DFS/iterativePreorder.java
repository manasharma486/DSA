import trees.*;
import java.util.Stack;

public class iterativePreorder {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        preorder(root);
    }

    private static void preorder(TNode root) {
        Stack<TNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TNode pop = stack.pop();
            System.out.print(pop.data + " ");

            if (pop.righTNode != null) {
                stack.push(pop.righTNode);
            }
            if (pop.lefTNode != null) {
                stack.push(pop.lefTNode);
            }
        }
    }


}
