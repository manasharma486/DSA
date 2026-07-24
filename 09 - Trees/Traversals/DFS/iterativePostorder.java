import trees.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;

public class iterativePostorder {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        System.out.println(postorder(root));

    }

    private static List<Integer> postorder(TNode root) {
        List<Integer> ans = new LinkedList<>();
        Stack<TNode> stack = new Stack<>();
        TNode node = root;
        while(node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.lefTNode;
            }

            else {
                TNode temp = stack.peek().righTNode;

                if (temp == null) {
                    temp = stack.peek();

                    ans.add(stack.pop().data);

                    while(!stack.isEmpty() && temp == stack.peek().righTNode) {
                        temp = stack.pop();
                        ans.add(temp.data);
                    }

                   

                }

                else {
                    node = temp;
                }
            }


        }
        return ans;
    }
}
