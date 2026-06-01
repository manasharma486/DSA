

public class UpperBoundAlgo {
    public static void main(String[] args) {
        int[] arr =  {3,5,8, 9,15,19} ;
        int x=  9 ;

        int low = 0 ;
        int high = arr.length-1 ;
        int ub = arr.length ;

        while(low <= high) {
            int mid = (low+high)/2 ;

            if (arr[mid] > x) {
                ub = mid ;
                high = mid-1 ;
            }

            else {
                low = mid + 1 ;
            }
        }

        System.out.println(ub);
    }
}
