import trees.*;
public class inorderRecurrsion {
   public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        inorder(root);
    }

    private static void inorder(TNode root) {
        if (root == null) {
            return;
        }

        inorder(root.lefTNode);
        System.out.print(root.data + " ");
        inorder(root.righTNode);
        
    }
}
