// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

 

// Example 1:

// Input: nums = [2,2,1]

// Output: 1

// Example 2:

// Input: nums = [4,1,2,1,2]

// Output: 4

// Example 3:

// Input: nums = [1]

// Output: 1

 

// Constraints:

//     1 <= nums.length <= 3 * 104
//     -3 * 104 <= nums[i] <= 3 * 104
//     Each element in the array appears twice except for one element which appears only once.

import java.util.Arrays;

public class SingleNumberLC136 {
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,4};
        System.out.println("Single Number : " + SingleNum(arr));
    }

   private static int SingleNum(int[] arr) {

    int xor = 0 ;

    for (int i = 0; i < arr.length; i++) {
        xor ^= arr[i];
    }

    return xor ;
    // int[] sortArr = arr.clone();
    // Arrays.sort(sortArr);

    // for (int i = 0; i < sortArr.length - 1; i += 2) {
    //     if (sortArr[i] != sortArr[i + 1]) {
    //         return sortArr[i];
    //     }
    // }

    // return sortArr[sortArr.length - 1];
}

}