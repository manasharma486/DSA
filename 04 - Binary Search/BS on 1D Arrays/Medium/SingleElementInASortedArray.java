public class SingleElementInASortedArray {
   public static void main(String[] args) {

    int[] arr = {7,7,10,11,11,12,12};
    int n = arr.length;
    int low = 1;
    int high = n - 2;
    int ans = -1;

    if (n == 1) {
        ans = arr[0];
    }

    else if (arr[0] != arr[1]) {
        ans = arr[0];
    }

    else if (arr[n - 1] != arr[n - 2]) {
        ans = arr[n - 1];
    }

    else {

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (arr[mid] != arr[mid - 1] &&
                arr[mid] != arr[mid + 1]) {

                ans = arr[mid];
                break;
            }

            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) ||
                (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {

                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }
    }

    System.out.println(ans);
   }
}