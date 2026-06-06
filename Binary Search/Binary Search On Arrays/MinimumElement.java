public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2} ;

        int n = arr.length ;
        int low = 0 ;
        int high = n-1 ;
        int ans   = Integer.MAX_VALUE ;


        while(low <= high) {

            int mid = (low+high)/2 ;

            if (arr[low] <= arr[mid]) {

                if (arr[low] < ans) {
                    ans = arr[low];
                }
                
                low = mid + 1 ;
            }

            else {
                if (ans > arr[mid]) {
                    ans = arr[mid] ;
                }

                high = mid -1 ;
            }

            
        }


        System.out.println(ans);

        
    }
}
