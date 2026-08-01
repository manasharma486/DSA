import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import trees.TNode;
import trees.TreesUtils;
import java.util.Stack;
import java.util.TreeMap;

class Coordinates {
    int row;
    int coloumn;

    public Coordinates(int row , int coloumn) {
        this.row = row;
        this.coloumn = coloumn;
    }

    @Override
    public String toString() {
        
        String ans = "(" + row + "," + coloumn + ")";
        return ans;
    }
}

class Pair {
    TNode node;
    Coordinates cord;

    public Pair(TNode node , Coordinates cord) {
        this.node = node;
        this.cord = cord;
    }

     @Override
    public String toString() {
        
        String ans = "(" + node.data + "," + cord + ")";
        return ans;
    }

}

class NodeInfo {
    int row;
    int value;

    public NodeInfo(int row , int value) {
        this.row = row;
        this.value = value;
    }
}

public class VerticleOrderTraversalLC987 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        TNode root = TreesUtils.arrToTree(arr);

        Map<Integer, List<NodeInfo>> map = preorder(root);


         List<List<Integer>> ans = new LinkedList<>();
         for (Integer integer : map.keySet()) {
            List<NodeInfo> list = map.get(integer);

             Collections.sort(list, (a, b) -> {
                if (a.row != b.row)
                return a.row - b.row;
                return a.value - b.value;
                });
            List<Integer> intList = new LinkedList<>();
            for (NodeInfo node : list) {
                intList.add(node.value);
            }
            ans.add(intList);
         }

         for (List<Integer> list : ans) {
            System.out.println(list);
         }
        
    }

    private static Map<Integer, List<NodeInfo>> preorder (TNode root) {
       Stack<Pair> stack = new Stack<>();
       Map<Integer, List<NodeInfo>> map = new TreeMap<>();
       stack.push(new Pair(root, new Coordinates(0, 0)));

       while(!stack.isEmpty()) {
            Pair pop = stack.pop();
            
            if (map.containsKey(pop.cord.coloumn)) {
                List<NodeInfo> list = map.get(pop.cord.coloumn);

                list.add(new NodeInfo(pop.cord.row, pop.node.data));

               
            }
            else {
                List<NodeInfo>list = new LinkedList<>();
                list.add(new NodeInfo(pop.cord.row, pop.node.data));

                map.put(pop.cord.coloumn,list);
            }

            if (pop.node.righTNode != null) {
                stack.push(new Pair(pop.node.righTNode, new Coordinates(pop.cord.row +1, pop.cord.coloumn+1)));
            }

            if (pop.node.lefTNode != null) {
                stack.push(new Pair(pop.node.lefTNode, new Coordinates(pop.cord.row+1, pop.cord.coloumn-1)));
            }

            
       }

       return map;
    }
}
