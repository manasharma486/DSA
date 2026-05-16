import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfSortedArrays {
    
    public static void main(String[] args) {
        int[] arr1 = {45,22,12,10,5,8,7};
        int[] arr2 = {22,12,11,1,6,8,9,7,14,51};

        Arrays.sort(arr1);
        Arrays.sort(arr2) ;

        List<Integer> nums = union(arr1, arr2);

        for (Integer integer : nums) {
            System.out.print(integer + " ");
        }

        
      
    }

   private static List<Integer> union(int[] arr1, int[] arr2) {
    List<Integer> result = new ArrayList<>();

    int i = 0;
    int j = 0;

    while (i < arr1.length && j < arr2.length) {

        if (arr1[i] < arr2[j]) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        } 
        else if (arr1[i] > arr2[j]) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        } 
        else {
            // both are equal
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
            j++;
        }
    }

    // remaining elements in arr1
    while (i < arr1.length) {
        if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
            result.add(arr1[i]);
        }
        i++;
    }

    // remaining elements in arr2
    while (j < arr2.length) {
        if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
            result.add(arr2[j]);
        }
        j++;
    }

    return result;
}
   
}
