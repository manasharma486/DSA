import java.util.Arrays;
import java.util.Scanner;

public class SortColorsLC75 {
//     75. Sort Colors
// Medium
// Topics
// premium lock iconCompanies
// Hint

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

 

// Constraints:

//     n == nums.length
//     1 <= n <= 300
//     nums[i] is either 0, 1, or 2.

 

// Follow up: Could you come up with a one-pass algorithm using only constant extra space?


public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }


    sortPointer(arr);

    System.out.println(Arrays.toString(arr));

    sc.close();

}

private static void sortHash(int[] arr) {

    int[] hashArr = new int[3];
    for (int i = 0; i < arr.length; i++) {
        hashArr[arr[i]]++;
    }

    

    int pointer = 0;

    for (int i = 0; i < hashArr.length; i++) {
        
        for (int j = 0; j < hashArr[i]; j++) {
            arr[pointer] = i ;
            pointer++;
        }

    }

    

    
}

private static void sortPointer(int[] arr){

    int left = 0 ;
    int mid = 0 ;
    int right = arr.length-1 ;

    while (mid <= right) {
        if(arr[mid]==0){
        int temp = arr[left];
        arr[left] = arr[mid];
        arr[mid] = temp ;
        left++ ;
        mid++;
        }

        else if(arr[mid] == 1) {
            mid ++ ;
        }

        else{
        
        int temp = arr[right];
        arr[right] = arr[mid];
        arr[mid] = temp ;
        right-- ;
        
        }

        }
    }
}


