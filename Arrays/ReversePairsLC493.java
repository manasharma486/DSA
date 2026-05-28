import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReversePairsLC493 {

// Given an integer array nums, return the number of reverse pairs in the array.

// A reverse pair is a pair (i, j) where:

//     0 <= i < j < nums.length and
//     nums[i] > 2 * nums[j].

 

// Example 1:

// Input: nums = [1,3,2,3,1]
// Output: 2
// Explanation: The reverse pairs are:
// (1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
// (3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1

// Example 2:

// Input: nums = [2,4,3,5,1]
// Output: 3
// Explanation: The reverse pairs are:
// (1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
// (2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
// (3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
    static int count = 0 ;
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,1} ;
        

        mergeSort(arr, 0 , 4);

        System.out.println(count);


        

    }

    private static void mergeSort(int[] arr , int low , int high) {

        if (low == high) return;
        int mid = (low+high)/2 ;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);

        compare(arr , low , mid , high);
        merge (arr , low , mid , high);
        

    }

    private static void compare(int [] arr , int low , int mid , int high) {
        int left = low ;
        int right = mid+1 ;
        
        for (int i = low; i <= mid; i++) {
            
            while(right <= high && arr[i] > 2 * arr[right]) {
               
                    right ++ ;

                }

                count += right - (mid+1);
                
            
        }
    }

    private static void merge(int[] arr , int low , int mid , int high) {
        int left = low ;
        int right = mid + 1 ;

        List<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high) {

            if (arr[left] < arr[right] ) {
                temp.add(arr[left]);
                left++ ;
            }
            else {
                temp.add(arr[right]);
                right++ ;
            }
        }

        while(left <= mid) {
            temp.add(arr[left]);
            left++ ;
        }
        while(right <= high) {
            temp.add(arr[right]);
            right++ ;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }


}
