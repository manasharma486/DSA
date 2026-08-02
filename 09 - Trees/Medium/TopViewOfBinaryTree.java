import java.util.*;
import trees.*;

class Pair{
    TNode node;
    int column;

    public Pair(TNode node , int column) {
        this.column = column;
        this.node= node;

    }

    @Override
    public String toString() {
        String ans = "(" + node.data + "," + column + ")";
        return ans;
    }
}
public class TopViewOfBinaryTree {
    public static void main(String[] args) {
        String arr = "[1,2,3,4,10,9,11,null,5,null,null,null,null,null,null,7,6,8]";
        TNode root = TreesUtils.stringToTree(arr);

        List<Integer> ans = topView(root);

        System.out.println(ans);
    }

    private static List<Integer> topView(TNode root) {
        List<Integer> ans = new LinkedList<>();
        List<Pair> list = new LinkedList<>(); 
        Queue<Pair> queue  = new LinkedList<>();
        Set<Integer> coloumns = new TreeSet<>();
        
        queue.offer(new Pair(root, 0));

        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Pair pop = queue.poll();

                if (!coloumns.contains(pop.column)) {
                    coloumns.add(pop.column);
                    list.add(pop);
                }

                if (pop.node.lefTNode != null) {
                    queue.offer(new Pair(pop.node.lefTNode, pop.column - 1));
                }


                if (pop.node.righTNode != null) {
                    queue.offer(new Pair(pop.node.righTNode, pop.column + 1));
                }


            }
           
        }

        Collections.sort(list , (a,b) -> {
            if (a.column != b.column) {
                return a.column - b.column;
            }
            return b.column- a.column;
        });


        for (Pair pair: list) {
            ans.add(pair.node.data);
        }
        return ans;
    }

}
