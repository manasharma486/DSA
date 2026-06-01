public class CountOccurenceInaSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 2, 3} ;
        int x = 2 ;
        int n = arr.length ;

        int low = 0 ;
        int high = n-1 ;

        int i = -1 ;
        int j = -1 ;

        while(low <= high) {
            int mid = low + ((high-low)/2);
            if (arr[mid] >= x) {
                if (arr[mid] == x) {
                    i = mid ;
                }

                high = mid -1 ;
            }

            else{
                low = mid + 1 ;
            }
        }


         low = 0 ;
         high = n-1 ;

         while(low <= high) {

            int mid = low + ((high-low)/2);

            if (arr[mid] <= x) {
                if (arr[mid] == x) {
                    j = mid ;
                }

                low = mid + 1 ;
            }

            else {
                high = mid -1 ;
            }

         }

         int count ;

         if (i == -1 && j == -1) {
            count = 0 ;
         }

         else {
            count = j-i+1 ;
         }


         System.out.println(count);

    }
}
