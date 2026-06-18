import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class KPositives {

//     Longest Subarray with given Sum K(Positives)

// Problem Statement: Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0. 
    
    public static void main(String[] args) {
        int[] arr = {9 ,4 ,0, 20 ,3 ,10,5};
        int[] nums = {9, -3, 3, -1, 6, -5};
        int k = 33 ;

        System.out.println("Longest Subarray is of Size : " + LongestSubArray(arr , k));
        System.out.println("SubArray Counts : " + totalSubArray(arr,k));
        
    }

   private static int totalSubArray(int[] arr, int k) {

        Map<Integer , Integer> map = new HashMap<>();

        int count = 0 ;
        int sum = 0 ;

        for (int i = 0; i < arr.length; i++) {

            sum+=arr[i];

            if(sum == k){
                count++ ;
            }

            if (map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }

            if(!map.containsKey(sum-k)){
                map.put(sum , map.getOrDefault(sum,0)+1);
            }
            
        }


        System.out.println(map);


        return count;
    }

   private static int LongestSubArray(int[] arr, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    int sum = 0;
    int maxLen = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

        // if subarray starts from index 0
        if (sum == k) {
            maxLen = i + 1;
        }

        // if (sum-k) exists
        if (map.containsKey(sum - k)) {
            int len = i - map.get(sum - k);
            maxLen = Math.max(maxLen, len);
        }

        // store first occurrence only
        if (!map.containsKey(sum)) {
            map.put(sum, i);
        }
    }

    System.out.println(map);

    return maxLen;
} 

}