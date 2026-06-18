public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int [] arr = {5,7,7,8,8,10} ;
        int x = 8 ;
        int n = arr.length ;

        int low = 0 ;
        int high = n-1;

        int i = -1 ;
        int j = -1 ;

        while(low <= high) {
            int mid  = low + ((high-low)/2) ;

            if (arr[mid] >= x) {
                if (arr[mid] == x) {
                    i = mid ;
                }
                high = mid-1 ;
            }

            else{
                low = mid+1 ;
            }

        }

        low = 0 ;
        high = n-1 ;

        while(low <= high) {
            int mid  = low + ((high-low)/2) ;

            if (arr[mid] <= x ) {
                if (arr[mid] == x) {
                    j= mid;
                }
                
                low = mid + 1 ;
            }

            else{
                high = mid -1 ;
            }
        }


        System.out.println(i + " " + j);
        
    }
}
