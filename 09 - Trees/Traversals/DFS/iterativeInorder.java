import trees.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;
public class iterativeInorder {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        System.out.println(inorder(root));

    }

    private static List<Integer> inorder(TNode root) {
        List<Integer> ans = new LinkedList<>();

        Stack<TNode> stack = new Stack<>();
        TNode node = root; 

        while (true) {
            if (node != null) {
                stack.push(node);
                node = node.lefTNode;
            }

            else {
                if (stack.isEmpty()) {
                    break;
                }
                node = stack.pop();
                ans.add(node.data);
                node = node.righTNode;
            }
        }

        return ans;
    }
}
