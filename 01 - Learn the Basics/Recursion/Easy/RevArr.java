
public class RevArr {

    static int left = 0;

    private static void reverse(int[] arr) {

        if (left > (arr.length) / 2) {
            return;
        }

        int right = (arr.length - 1) - left;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;

        reverse(arr);

    }

    public static void main(String[] args) {

        int[] arr = { 12, 13, 45, 5, 6, 14 };
        reverse(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(" " + arr[i] + " ");

        }
    }

}
