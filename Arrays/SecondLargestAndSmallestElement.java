
public class SecondLargestAndSmallestElement {

    static int secondLargest(int[] arr) {

        int max = arr[0];
        int secondMax = arr[1];

        for (int i = 1; i < arr.length; i++) {

            if (max < arr[i]) {

                secondMax = max;
                max = arr[i];

            }

            else if (max < arr[i] && arr[i] != max) {

                secondMax = Integer.max(arr[i], secondMax);
            }

        }

        return secondMax;

    }

    static int secondSmallest(int[] arr) {

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {

                secondMin = min;
                min = arr[i];

            }

            else if (arr[i] < min && arr[i] != min) {

                secondMin = Integer.min(secondMin, arr[i]);
            }

        }

        return secondMin;
    }

    public static void main(String[] args) {

        int arr[] = { 28, 35, 2, 1, 3 };

        System.out.println(secondLargest(arr) + " " + secondSmallest(arr));

    }
}
