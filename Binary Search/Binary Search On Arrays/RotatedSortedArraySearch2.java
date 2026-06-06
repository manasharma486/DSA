public class RotatedSortedArraySearch2 {
    public static void main(String[] args) {
        
        int[] arr = {2,5,6,0,0,1,2};
        int x = 0 ;

        int n = arr.length ;
        int low = 0 ;
        int high = n-1 ;

        int ans = -1 ;

        while(low <= high) {

            int mid = low + ((high-low)/2) ;

            if (arr[mid] == x) {
                ans = mid;
                break ;
            }

            if (arr[mid] ==  arr[low] && arr[mid] == arr[high]) {
                low++ ;
                high-- ;

                continue ;
            }

            else  if (arr[low] < arr[mid]) {

                if (arr[low] <= x && x < arr[mid]) {
                    high = mid-1 ;
                }
                else {
                    low = mid +1 ;
                }
            }

            else {

                if (arr[mid] < x && arr[high] >= x) {
                    low = mid+1;
                }

                else {
                    high = mid-1;
                }
            }

        }


        System.out.println(ans);

    }
}
