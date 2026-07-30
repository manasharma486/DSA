import trees.*;
public class DiameterOfBinaryTreeLC543 {

    static int dia = 0;
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        System.out.println(diameter(root)[1]);
    }


    private static int[] diameter(TNode root) {

        if (root == null) {
            return new int[]{0,0};
        }

        int left = diameter(root.lefTNode)[0];
        int right = diameter(root.righTNode)[0];

        int height = 1 + Math.max(left, right);
        dia = Math.max(dia , (right + left));

        return new int[]{height, dia};
    }
}
