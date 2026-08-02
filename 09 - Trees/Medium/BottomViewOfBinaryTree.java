import trees.*;
import java.util.*;

class Pair{
    int row;
    TNode node;
    int col;

    public Pair(int row , TNode node, int col) {
        this.row = row;
        this.node = node;
        this.col = col;
    }

    @Override
    public String toString() {
        String ans = "[" + node.data + " , (" + row + "," + col + ") ]"; 
        return ans;
    }
}
public class BottomViewOfBinaryTree {
    public static void main(String[] args) {
        String arr = "[1,2,3,4,10,9,11,null,5,null,null,null,null,null,null,7,6,8]";

        TNode root = TreesUtils.stringToTree(arr);

        System.out.println(bottomView(root));
    }
    private static List<Integer>bottomView(TNode root) {
        List<Integer> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        TreeMap<Integer, Pair>map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(0, root, 0));

        while(!queue.isEmpty()) {
            int lenght = queue.size();

            for (int i = 0; i < lenght; i++) {
                Pair pop = queue.poll();

                if (map.containsKey(pop.col)) {
                    Pair em = map.get(pop.col);

                    if (em.row == pop.row) {
                        if (em.node.data > pop.node.data) {
                            map.put(pop.col , pop);
                        }
                    }
                    else {
                        map.put(pop.col, pop);
                    }
                }
                else {
                    map.put(pop.col, pop);
                }


                if (pop.node.lefTNode != null) {
                    queue.offer(new Pair(pop.row + 1, pop.node.lefTNode, pop.col - 1));
                }
                if (pop.node.righTNode != null) {
                    queue.offer(new Pair(pop.row + 1, pop.node.righTNode, pop.col +1));
                }
            }


        }

        for (int i : map.keySet()) {
            Pair pair = map.get(i);

            ans.add(pair.node.data);
        }

        return ans;
    }
}
