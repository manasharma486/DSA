import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

   List<List<Integer>> ans = new ArrayList<>();
   

   Arrays.sort(arr);

   for (int i = 0; i < arr.length; i++) {

        if (i > 0 && arr[i] == arr[i-1]) {
            continue ;
        }

        int left = i +1 ;
        int right = arr.length-1 ;

        while(left < right) {
            int sum = arr[i] + arr[left] + arr[right];

            if (sum < 0) {
                left ++ ;
            }

            else if (sum > 0) {
                right-- ;
            }

            

            else if (sum == 0) {

                List<Integer>triplet = new ArrayList<>();

                triplet.add(arr[i]);
                triplet.add(arr[left]);
                triplet.add(arr[right]);
                ans.add(triplet);
                
                
                left ++ ;

                right -- ;


                while (left < right && arr[left] == arr[left-1]) {
                    left ++ ;
                }

                while(right > left && right != arr.length-1 && arr[right] == arr[right+1]) {
                    right -- ;
                }

            } 
        }


        
    
   }

   System.out.println(ans);

    }
}
