import trees.*;

public class postorderRecurrsion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        postorder(root);
    }

    private static void postorder(TNode root) {
        if (root == null) {
            return;
        }

        postorder(root.lefTNode);
        postorder(root.righTNode);
        System.out.print(root.data + " ");
    }
}
