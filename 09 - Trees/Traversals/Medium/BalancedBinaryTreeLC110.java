import trees.*;
public class BalancedBinaryTreeLC110 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        boolean ans = isBalanced(root) != -1 ? true : false;

        System.out.println(ans);

    }

    private static int isBalanced(TNode root )  {
        if (root == null) {
            return 0;
        }

        int left =  isBalanced(root.lefTNode);

        if (left == -1) {
            return -1;
        }

        int right = isBalanced(root.righTNode);

        if (right == -1) {
            return -1;
        }


       if (Math.abs(left - right) > 1) {
        return -1;
       }

        return 1+Math.max(left, right);
    }
}
