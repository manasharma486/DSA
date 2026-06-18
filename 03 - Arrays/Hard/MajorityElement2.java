import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement2 {
//     229. Majority Element II
// Solved
// Medium
// Topics
// premium lock iconCompanies
// Hint

// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]

// Example 2:

// Input: nums = [1]
// Output: [1]

// Example 3:

// Input: nums = [1,2]
// Output: [1,2]

 

// Constraints:

//     1 <= nums.length <= 5 * 104
//     -109 <= nums[i] <= 109

 

// Follow up: Could you solve the problem in linear time and in O(1) space?

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }


    List<Integer>elements = new ArrayList<> ();
    Map<Integer,Integer>map = new HashMap<>() ;

    for (int integer : arr) {
        map.put(integer , map.getOrDefault(integer,0) + 1) ;

        
        if(n < 3) {
            elements.add(integer);
        }
        
        else if (map.get(integer) == (n/3) + 1 ){
            elements.add(integer);
        }
    }


    System.out.println(elements);

}

}
