import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Given an integer array nums and an integer k, return true if nums has a good subarray or false otherwise.

// A good subarray is a subarray where:

//     its length is at least two, and
//     the sum of the elements of the subarray is a multiple of k.

// Note that:

//     A subarray is a contiguous part of the array.
//     An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.


public class ContinousSubArraySum {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt() ;

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    Map<Integer , Integer> map = new HashMap<>() ;

    int sum = 0 ;
    int rem ;
    map.put(0,-1);


    for (int i = 0; i < arr.length; i++) {



        sum += arr[i] ;
        rem = sum % k ;

        if (map.containsKey(rem)) {
            if (i - map.get(rem) >= 2) {
                System.out.println(true);
            }

            
        }

        else{
            map.put(rem , i) ;
        }

       
        
    }


    System.out.println(false);


    // Approach : there is a property of modulo 
    // if two numbers whose reminders are same  when applying modulo with suupose a number k then the difference will be divisible by k 

    

  


    }
}
