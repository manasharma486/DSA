import java.util.Arrays;

public class RecurrsiveBinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {3,5,8,10,15,16};
        int target = 8 ;
        int low = 0 ;
        int high = arr.length-1 ;
        int index = binarySearchR(arr, target , low , high);

        if (index == -1) {
            System.out.println("The element " + target + " is not present in the given array : " + Arrays.toString(arr));
        }
        else{
            System.out.println("The element " + target + " is present at index " + index + " in the given array: " + Arrays.toString(arr));
        }
    }

    private static int binarySearchR(int[] arr , int target , int low , int high ) {

        

        if (low > high ) {
            return -1 ;
        }

        int mid = (low + high )/2 ;


        if (arr[mid] == target){
            return mid ;
        }

        else if (arr[mid] > target){
            return binarySearchR(arr, target, low, mid-1);
        }
        else{
            return binarySearchR(arr, target, mid+ 1, high);
        }

       

        
    }
}
