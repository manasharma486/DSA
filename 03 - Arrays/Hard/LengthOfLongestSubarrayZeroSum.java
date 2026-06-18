import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfLongestSubarrayZeroSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }


    Map<Integer , Integer> map = new HashMap<>();
    int sum = 0 ;
    int length = 0 ;

    for (int i = 0; i < arr.length; i++) {
        sum +=arr[i];

        if (map.containsKey(sum)) {
            length = Math.max(length, i-map.get(sum));
        }

        else{
            map.put(sum , i);
        }
        
    }

    System.out.println(length);
}

}
