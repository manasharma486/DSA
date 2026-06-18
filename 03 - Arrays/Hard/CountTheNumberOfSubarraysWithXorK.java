import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheNumberOfSubarraysWithXorK {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int target = sc.nextInt() ;

    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    Map<Integer , Integer> map = new HashMap<>();
    int count = 0 ;
    int sum = 0 ;

    for (int i : arr) {
        sum ^= i ;

        if (sum == target) {
            count ++ ;
        }

        if (map.containsKey(sum^target)){
            count+= map.get(sum^target);
        }

        
            map.put(sum , map.getOrDefault(sum , 0) + 1) ;
        
    }

    System.out.println(count);
    System.out.println(map);
}

}
