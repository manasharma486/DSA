public class MoveZeroesLC283 {

//     283. Move Zeroes
// Easy
// Topics
// premium lock iconCompanies
// Hint

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2:

// Input: nums = [0]
// Output: [0]

 

// Constraints:

//     1 <= nums.length <= 104
//     -231 <= nums[i] <= 231 - 1

 
// Follow up: Could you minimize the total number of operations done?
    
    public static void main(String[] args) {
        
        int[] arr = {0,1,0,3,12};

        movezeroes(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void movezeroes(int[] arr){

        int left = 0 ;

        for (int right = 0; right < arr.length; right++) {
           
            if (arr[right] != 0) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp ;
                left ++ ;
            }

        }
    }
}