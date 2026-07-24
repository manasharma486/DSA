import trees.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;

class Pair {
    TNode first;
    int second;

    Pair(TNode first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class prePostandInorder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        List<List<Integer>> ans = DFS(root);
        System.out.println("Pre-Order: " + ans.get(0));
        System.out.println("In-Order: " + ans.get(1));
        System.out.println("Post-Order: " + ans.get(2));

    }

    private static List<List<Integer>> DFS (TNode root) {

        List<Integer> preorder = new LinkedList<>();
        List<Integer> inorder = new LinkedList<>();
        List<Integer> postorder = new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();

        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 1));

        while(!stack.isEmpty()) {

            Pair it = stack.pop();

            if (it.second == 1) {
                preorder.add(it.first.data);
                it.second++;
                stack.push(it);

                if (it.first.lefTNode != null) {
                stack.push(new Pair(it.first.lefTNode, 1));
            }

            }

            

            else if (it.second == 2) {
                inorder.add(it.first.data);
                it.second++;
                stack.push(it);

                if(it.first.righTNode != null) {
                    stack.push(new Pair(it.first.righTNode, 1));

                }
            }

            else {
                postorder.add(it.first.data);
            }
        }



        ans.add(preorder);
        ans.add(inorder);
        ans.add(postorder);

        return ans;
    }
}
