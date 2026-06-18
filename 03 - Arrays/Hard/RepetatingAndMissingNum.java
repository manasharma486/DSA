import java.util.HashMap;
import java.util.Map;

public class RepetatingAndMissingNum {
    public static void main(String[] args) {
        
        int[] nums = {1, 2, 3, 6, 7, 5, 7} ;
        int n = nums.length ;
        int[] ans = new int[2] ;
        int sum = 0 ;

        Map<Integer , Integer> map = new HashMap<>() ;

        for (int i : nums) {
            map.put(i , map.getOrDefault(i, 0) + 1) ;

            sum+= i ;

            if (map.get(i) == 2) {
                ans[0] = i ;
            }
        }

        ans[1] = ((n*(n+1))/2 ) - (sum - ans[0] );



        System.out.println(ans[0] + " " + ans[1] );


    }
}
