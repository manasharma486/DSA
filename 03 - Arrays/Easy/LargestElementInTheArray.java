
public class LargestElementInTheArray {

    static int maxEm(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (max > arr[i]) {
                continue;
            } else
                max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = { 8, 10, 5, 7, 9 };

        System.out.println(maxEm(arr));
    }
}
