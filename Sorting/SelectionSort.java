/*
Selection sort works by repeatedly selecting the smallest element from the unsorted part of the array and placing it at the beginning. Starting with the array `{45, 26, 89, 74, 12, 11}`, it first finds the minimum element (11) and swaps it with the first element, giving `{11, 26, 89, 74, 12, 45}`. Then it looks at the remaining unsorted part, finds the next minimum (12), and swaps it with the second element, continuing this process until the array is sorted as `{11, 12, 26, 45, 74, 89}`. The key idea to remember is that after each pass, one element is placed in its correct position, so the sorted portion grows from left to right. Selection sort always takes O(n²) time regardless of input and uses O(1) extra space. It is not stable and cannot be significantly optimized for early stopping, but it is efficient in terms of swaps since it performs at most one swap per pass.

*/





public class SelectionSort {

    
    // this method will return me the index of the minimum value of the unsorted part of an array 

public static int unsortedMinimumIndex(int arr[], int i) {
    int minIndex = i;

    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }

    return minIndex;
}

    public static void sort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) {

            int minIndex = unsortedMinimumIndex(arr, i);

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp ;
            
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {45, 26, 89, 74, 12, 11};

        sort(arr);
        
        for(int i : arr)
            System.out.println(i);

    }
}