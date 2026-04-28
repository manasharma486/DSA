public class IndexOfMinEm {


public static int unsortedMinimumIndex(int arr[], int i) {
    int minIndex = i;

    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    return minIndex;
}
    public static void main(String[] args) {
        int[] arr = {45, 26, 89, 74, 12, 11};

        
        int minIndex = 0 ;

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] < arr[minIndex]) {
                minIndex = i ;
            }
        }

        System.out.println(unsortedMinimumIndex(arr, 2));
    }
}