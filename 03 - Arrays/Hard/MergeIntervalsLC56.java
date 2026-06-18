import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsLC56 {
    public static void main(String[] args) {
        int[][] arr = {{1,3} , {2,6} , {8,10} , {15,18}};

        Arrays.sort(arr , (a,b) -> {
                for (int i = 0; i < Math.min(a.length , b.length); i++) {
                    if (a[i] != b[i]) {
                        return a[i] - b[i] ;
                    }
                }
                return a.length-b.length;
        });

        List<int []> ans = new ArrayList<>();

        int[] current = arr[0] ;
        for (int i = 1; i < arr.length; i++) {

            //merge condition;
            if ( current[1] >= arr[i][0] ) {

                current[1] = Math.max(current[1],arr[i][1]);
               
            }
            else{
                ans.add(current);
                current = arr[i];
                
            }
            
        }
        ans.add(current);

      for (int[] is : ans) {
        System.out.println(Arrays.toString(is));
      }

    }
}
