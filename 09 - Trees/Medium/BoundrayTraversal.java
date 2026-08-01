import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import trees.*;
public class BoundrayTraversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,22};
        TNode root = TreesUtils.arrToTree(arr);
        
        TreesUtils.printTree(root);

        
        System.out.println(BT(root));
    }
    private static List<Integer> BT(TNode root) {

        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }

        ans.add(root.data);
        leftTraversal(ans, root);
        leafNodes(ans, root);
        rightTraversal(ans, root);

        return ans;

    }
    private static void leftTraversal(List<Integer> ans , TNode root) {
        TNode temp = root.lefTNode;

        while(temp != null) {

            if (temp.lefTNode == null && temp.righTNode == null) {
                break;
            }
            
            ans.add(temp.data);
            
            if (temp.lefTNode == null) {
                temp = temp.righTNode;
                continue;
            }
            temp = temp.lefTNode;

        }
    }

    private static void rightTraversal(List<Integer> ans , TNode root) {
        TNode temp= root.righTNode;
        Stack<TNode> stack = new Stack<>();

        while(temp != null) {

            
            if (temp.lefTNode == null && temp.righTNode == null) {
                break;
            }

            stack.push(temp);

            if (temp.righTNode == null) {
                temp = temp.lefTNode;
                continue;
            }
            temp = temp.righTNode;


        }

        while(!stack.isEmpty()) {
            ans.add(stack.pop().data);
        }

    }

    private static void leafNodes(List<Integer> ans , TNode root) {
        Stack<TNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {

            TNode pop = stack.pop();

            if (pop.lefTNode == null && pop.righTNode == null) {
                ans.add(pop.data);
            }

            

            if (pop.righTNode != null) {
                stack.push(pop.righTNode);
            }

            if (pop.lefTNode != null) {
                stack.push(pop.lefTNode);

            }
        }
    }
}

