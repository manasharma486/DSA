import java.util.*;
import trees.*;

public class BinaryTreerightSideViewLC199 {
    public static void main(String[] args) {
        String arr = "[1,2,3,null,5,null,4]";
        
        TNode root = TreesUtils.stringToTree(arr);
        System.out.println(rightView(root));
    }

    private static List<Integer> rightView(TNode root) {
        List<Integer> ans = new LinkedList<>();
        Queue<TNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int len = queue.size();
 
            for (int i = 0; i < len; i++) {
                TNode pop = queue.poll();
                
                if (i == len-1) {
                    ans.add(pop.data);
                }
                if (pop.lefTNode != null) {
                    queue.offer(pop.lefTNode);
                }
                if (pop.righTNode != null) {
                    queue.offer(pop.righTNode);
                }
                
            }
          
        }
        return ans;
    }
}
