import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequenceArray {
    

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }




    HashSet<Integer> set = new HashSet<>() ; //it DOES NOT gives the sorted values

    for (int  num : arr) {
        set.add(num);
    }

    int len = 0 ; 

    for (Integer num : set) {
        if (!set.contains(num-1)){
            int count = 1 ;
            int currentNum = num ;


            while(set.contains(currentNum +1)) {
                count ++ ;
                currentNum ++ ;
            }

            
            len = Math.max(count, len) ;


        }
    }
    System.out.println(len);
    
    }
}
