import trees.*;
public class BinaryTreeMaximumPathSumLC124 {

    static int sum = 0;

    public static void main(String[] args) {
        int[] arr = {1,2,-45,65,20,92,32,-10};

        TNode root = TreesUtils.arrToTree(arr);
       
        maxPathSum(root);

        System.out.println(sum);
    }

    private static int maxPathSum(TNode root ) {
        if (root == null) {
            return 0;
        }

        int left = Math.max(0, maxPathSum(root.lefTNode));
        int right = Math.max(0, maxPathSum(root.righTNode));

       

        sum = Math.max(left + right + root.data , sum);


        return root.data + Math.max(left, right);

    }
}
