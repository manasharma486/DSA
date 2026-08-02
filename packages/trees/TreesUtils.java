package trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreesUtils {

   public static TNode arrToTree(int[] arr) {

        if (arr == null || arr.length == 0) {
            return null;
        }

        Queue<TNode> queue = new LinkedList<>();

        TNode head = new TNode(arr[0]);
        queue.offer(head);

        int i = 1;

        while (i < arr.length) {

            TNode currentNode = queue.poll();

            // Left child
            if (i < arr.length) {
                currentNode.lefTNode = new TNode(arr[i]);
                queue.offer(currentNode.lefTNode);
                i++;
            }

            // Right child
            if (i < arr.length) {
                currentNode.righTNode = new TNode(arr[i]);
                queue.offer(currentNode.righTNode);
                i++;
            }
        }

        return head;
    }

    public static void printTree(TNode root) {
        int height = height(root);

        int rows = height * 2 - 1;
        int cols = (1 << height) * 2;

        String[][] canvas = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                canvas[i][j] = " ";
            }
        }

        fill(canvas, root, 0, cols / 2, height);

        for (String[] row : canvas) {
            StringBuilder sb = new StringBuilder();
            for (String s : row) {
                sb.append(s);
            }

            // Remove trailing spaces
            System.out.println(sb.toString().replaceFirst("\\s+$", ""));
        }
    }

    private static void fill(String[][] canvas,
                             TNode node,
                             int row,
                             int col,
                             int height) {

        if (node == null)
            return;

        canvas[row][col] = String.valueOf(node.data);

        if (height <= 1)
            return;

        int gap = 1 << (height - 2);

        // Left child
        if (node.lefTNode != null) {
            canvas[row + 1][col - gap / 2] = "/";
            fill(canvas,
                    node.lefTNode,
                    row + 2,
                    col - gap,
                    height - 1);
        }

        // Right child
        if (node.righTNode != null) {
            canvas[row + 1][col + gap / 2] = "\\";
            fill(canvas,
                    node.righTNode,
                    row + 2,
                    col + gap,
                    height - 1);
        }
    }

    private static int height(TNode node) {
        if (node == null)
            return 0;

        return 1 + Math.max(height(node.lefTNode),
                            height(node.righTNode));
    }

    public static TNode stringToTree(String input) {

    input = input.trim();

    if (input.equals("[]"))
        return null;

    input = input.substring(1, input.length() - 1);

    String[] values = input.split(",");

    if (values.length == 0 || values[0].trim().equals("null"))
        return null;

    TNode root = new TNode(Integer.parseInt(values[0].trim()));

    Queue<TNode> queue = new LinkedList<>();
    queue.offer(root);

    int i = 1;

    while (!queue.isEmpty() && i < values.length) {

        TNode current = queue.poll();

        // Left Child
        if (i < values.length && !values[i].trim().equals("null")) {

            current.lefTNode = new TNode(Integer.parseInt(values[i].trim()));
            queue.offer(current.lefTNode);
        }

        i++;

        // Right Child
        if (i < values.length && !values[i].trim().equals("null")) {

            current.righTNode = new TNode(Integer.parseInt(values[i].trim()));
            queue.offer(current.righTNode);
        }

        i++;
    }

    return root;
}

}