public class KthMissingPositiveIntegerLC {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4};
        int k = 2  ;

       int  count = 0 ;

       

       for (int i = 1 ; i <= (arr.length + k) ; i++) {

        if (!(search(arr, i))){

            count ++ ;

       }

       if (count == k) {
            count  = i ;
            break;
       }

    }

    System.out.println( count);
}



    private static boolean search(int[] arr , int element) {

        int n = arr.length;
        int low = 0 ;
        int high = n-1;


        while(low <= high) {
            int mid = low + (high - low)/2 ;

            if (arr[mid]== element) {
                return true ;
            }

            else if (arr[mid] < element) {
                low = mid + 1 ;
            }

            else{
                high = mid - 1;
            }
        }


        return false;
    }
}