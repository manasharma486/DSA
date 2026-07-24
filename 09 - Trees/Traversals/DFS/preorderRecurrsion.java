import trees.*;

public class preorderRecurrsion {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};

        TNode root = TreesUtils.arrToTree(arr);
     

        preorder(root);
    }

    private static void preorder(TNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.lefTNode);
        preorder(root.righTNode);
    }
}
