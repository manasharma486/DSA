import java.util.Arrays;

public class MagneticforceBetweenTwoBallsLC1552 {
    
    public static void main(String[] args) {
        int[] position = {5,4,3,2,1,1000000000};
        int m = 2;

        Arrays.sort(position);

        int ans = -1 ;

        int low = 1 ;
        int high = position[position.length - 1] - position[0];

        while(low <= high) {
            int mid = low + (high -low)/2 ;

            if (canWePlaceBalls(position, m, mid)) {
                ans = mid ;
                low = mid + 1;
            }

            else{
                high = mid - 1 ;
            }
        }


        System.out.println(ans);
    }

    private static boolean canWePlaceBalls(int[] arr , int m , int disBwTheBalls){
        int lastBall = 0;
        int ballsPlaced = 1 ;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[lastBall] >= disBwTheBalls){
                ballsPlaced ++ ;
                lastBall = i ;
            }
        }

        return ballsPlaced >= m ? true : false ;
    }
}
