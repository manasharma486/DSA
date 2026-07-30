import trees.*;
public class SameTreeLC100 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8};

        TNode root1 = TreesUtils.arrToTree(arr1);

        TNode root2 = TreesUtils.arrToTree(arr2);

        System.out.println(isSame(root1, root2));
    }

    private static boolean isSame(TNode root1, TNode root2) {
        
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data != root2.data ) {
            return false;
        }

        return isSame(root1.lefTNode, root2.lefTNode) && isSame(root1.righTNode, root2.righTNode);

        
    }

    

   


    
}
