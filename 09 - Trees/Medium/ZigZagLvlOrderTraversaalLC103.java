import trees.*;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
public class ZigZagLvlOrderTraversaalLC103 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        TNode root = TreesUtils.arrToTree(arr);



        List<List<Integer>> ans = zigZag(root);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        
    }

    private static List<List<Integer>> zigZag(TNode root) {
        
        List<List<Integer>> zigzag = new LinkedList<>(); 
        Deque<TNode> queue = new ArrayDeque<>();

        queue.offer(root);
        boolean flag = true;

        while(!queue.isEmpty()) {
            int length = queue.size();
            List<Integer> nodes = new LinkedList<>();
            for (int i = 0; i < length; i++) {
                TNode pop = queue.poll();
                nodes.add(pop.data);

                    if (pop.lefTNode != null) {
                        queue.offer(pop.lefTNode);
                    }

                    if (pop.righTNode != null) {
                        queue.offer(pop.righTNode);
                    }
            }

            if (!flag) {
                Collections.reverse(nodes);
                zigzag.add(nodes);
            }

            else {
                zigzag.add(nodes);
            }

            flag = !flag;

            
        }

        return zigzag;
    }
}

