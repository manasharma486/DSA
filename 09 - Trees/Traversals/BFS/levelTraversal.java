import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import trees.*;
public class levelTraversal {
   
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        List<List<Integer>> ans = printLevel(root);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    private static List<List<Integer>> printLevel(TNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> levelIntegers = new LinkedList<>();

            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().lefTNode != null) {
                    queue.offer(queue.peek().lefTNode);
                }
                if (queue.peek().righTNode != null) {
                    queue.offer(queue.peek().righTNode);
                }

                levelIntegers.add(queue.poll().data);
            }

            ans.add(levelIntegers);
        }

        return ans;
    }
}


