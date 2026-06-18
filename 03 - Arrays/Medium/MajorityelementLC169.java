import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityelementLC169 {

    
    
// 169. Majority Element
// Solved
// Easy
// Topics
// premium lock iconCompanies

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3

// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println(MajorityEm(arr));



}

private static int MajorityEm(int[] arr) {

    Map<Integer , Integer> map = new HashMap<>() ;


    for (int i = 0; i < arr.length; i++) {

        map.put(arr[i] , map.getOrDefault(arr[i] , 0) +1 );
        
    }

    int max = 0 ;
    int em = 0 ;
    for (int i : map.keySet()){

        if (max < map.get(i)) {

            max = Math.max(max , map.get(i));
            em = i ;
        }
        
    }

    return em ;
}

    
}
