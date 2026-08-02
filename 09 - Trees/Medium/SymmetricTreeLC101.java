import trees.*;

public class SymmetricTreeLC101 {
    public static void main(String[] args) {
        String arr = "[1,2,2,3,4,4,3]";
        TNode root = TreesUtils.stringToTree(arr);
        System.out.println(isSymmetric( root.lefTNode , root.righTNode));        
    }

    private static boolean isSymmetric( TNode left , TNode right) {
        if (left == null || right == null){
            return left == right;
        }
        
        if (left.data != right.data) {
            return false;
        }

        return isSymmetric(left.lefTNode, right.righTNode) && isSymmetric(left.righTNode, right.lefTNode);
    }
}
