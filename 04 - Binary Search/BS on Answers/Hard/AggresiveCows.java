import java.util.Arrays;

public class AggresiveCows {
    
    public static void main(String[] args) {
        
        int[] arr = {4,2,1,3,6};
        int ans = -1 ;
        int k = 2 ; 

        Arrays.sort(arr);

        int low = 1 ; 
        int high = arr[arr.length-1] - arr[0];

        System.out.println(canWePlaceCows(arr, k, high));


        while(low <= high) {
            int mid = low + (high-low)/2 ;

            if (canWePlaceCows(arr, k, mid)){
                ans = mid ;
                low = mid + 1 ;
            }
            else{
                high = mid-1 ;
            }
        }


        System.out.println(ans);
    }

    private static boolean canWePlaceCows(int[] arr , int k , int maintainDis){
        int lastCowPos = 0 ;
        int cowsPlaced = 1 ;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[lastCowPos] >= maintainDis){
                cowsPlaced++ ;
                lastCowPos = i ;
            }
        }

        return cowsPlaced>= k ? true : false ;
    }
}
