import java.util.Arrays;

public class IterativeBinarySearch {
    
    public static void main(String[] args) {
        
        int[] arr = {3,5,8,10,15,16};
        int target = 17 ;
        int index = binarySearchI(arr, target);

        if (index == -1) {
            System.out.println("The element " + target + " is not present in the given array : " + Arrays.toString(arr));
        }
        else{
            System.out.println("The element " + target + " is present at index " + index + " in the given array: " + Arrays.toString(arr));
        }
    }


    private static int binarySearchI(int[] arr , int target) {
        int low = 0 ;
        int high = arr.length-1 ;

        while(low<= high) {
            int mid = (low+high)/2 ;

            if (arr[mid] == target) {
                return mid ;
            }

            else if (arr[mid] > target) {
                high = mid -1 ;
            }

            else{
                low = mid+1 ;
            }
        }

        return -1 ;
    }
}
