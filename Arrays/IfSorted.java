
public class IfSorted {
    static Boolean isSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {

                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 6, 7, 8 };
        System.out.println(isSort(arr));
    }
}
