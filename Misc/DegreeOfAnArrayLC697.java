import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DegreeOfAnArrayLC697 {
    

//     Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

// Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

 

// Example 1:

// Input: nums = [1,2,2,3,1]
// Output: 2
// Explanation: 
// The input array has a degree of 2 because both elements 1 and 2 appear twice.
// Of the subarrays that have the same degree:
// [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
// The shortest length is 2. So return 2.


    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }


    Map<Integer , Integer>freqMap = new HashMap<>();
    Map<Integer , Integer>firstOccMap = new HashMap<>();
    Map<Integer , Integer>lastOccMap = new HashMap<>();
    int deg = -1 ;


    int minDeg = Integer.MAX_VALUE ;

    for (int i = 0; i < arr.length; i++) {

        freqMap.put(arr[i] , freqMap.getOrDefault(arr[i], 0)+1) ;

        if (freqMap.get(arr[i] ) > deg) {
            deg = freqMap.get(arr[i]);
        }


        if (freqMap.get(arr[i]) == 1) {
            firstOccMap.put(arr[i] , i);
        }

        lastOccMap.put(arr[i] , i) ;
        
    }

    for (int i : freqMap.keySet()) {
        if (deg == freqMap.get(i)) {
            minDeg = Math.min(minDeg , (lastOccMap.get(i)- firstOccMap.get(i) + 1 ));
        }
    }


    System.out.println(minDeg);

    System.out.println(freqMap);
    System.out.println(firstOccMap);
    System.out.println(lastOccMap);


    
}


}