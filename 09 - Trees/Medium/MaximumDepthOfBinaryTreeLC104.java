import java.util.Stack;

import trees.*;

class Pair {
    TNode root;
    int dis;

    public Pair (TNode root , int dis) {
        this.root = root;
        this.dis = dis;
    }

    @Override 
    public String toString() {
        
        String ans = "[ " + root.data + " , " + dis + " ]";

        return ans;
    }
}
public class MaximumDepthOfBinaryTreeLC104 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        System.out.println(depth(root));

        System.out.println(maxDepth(root));
    }

    private static int depth(TNode root) {
        if (root == null) {
            return 0;
        }

        int distance = 0 ;
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, distance));

        while(!stack.isEmpty()) {
            Pair pop= stack.pop();

           if (pop.root.lefTNode == null && pop.root.righTNode==null) {
                distance = Math.max(pop.dis + 1, distance);
           }

           else {

            if (pop.root.righTNode != null) {
                stack.push(new Pair(pop.root.righTNode , pop.dis + 1));
               
            }
            if (pop.root.lefTNode != null) {
                stack.push(new Pair(pop.root.lefTNode , pop.dis + 1));
            }

           }


        }

        return distance;
    }

    private static int maxDepth(TNode root) {
        if (root == null) {
            return 0 ;
        }

        int lh = maxDepth(root.lefTNode);
        int rh = maxDepth(root.righTNode);

        return 1+ Math.max(lh, rh);
    }
}
