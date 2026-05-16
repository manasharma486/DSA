import java.util.*;

public class FoodStamps {

    static class Node {
        long value;
        int index;
        int time; // how many times this food has been taken

        Node(long value, int index, int time) {
            this.value = value;
            this.index = index;
            this.time = time;
        }
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 5;

        int[] varr = {5, 7, 9};
        int[] darr = {2, 4, 6};

        long tastePoints = 0;

        // max heap (pick highest taste every time)
        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(b.value, a.value)
        );

        // initialize first pick of each food
        for (int i = 0; i < n; i++) {
            pq.add(new Node(varr[i], i, 1));
        }

        for (int i = 0; i < m; i++) {

            Node curr = pq.poll();
            tastePoints += curr.value;

            int idx = curr.index;
            int t = curr.time;

            // next value of same food:
            long nextValue = varr[idx] - (long) darr[idx] * t;

            if (nextValue > 0) {
                pq.add(new Node(nextValue, idx, t + 1));
            }
        }

        System.out.println(tastePoints);
    }
}