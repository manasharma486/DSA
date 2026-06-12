public class AllocatebooksVVIP {
    public static void main(String[] args) {

        int[] arr = {25, 46, 28, 49, 24 };
        int m = 4 ;


        int ans = -1 ;
        int low = maxVal(arr);
        int high = sum(arr);

        
       

        while(low <=  high) {
            int mid = low  + (high - low)/2 ;

            if (canHoldBooks(arr, m, mid) <= m) {
                ans = mid;
                high = mid-1; 
                
            }

            else if (canHoldBooks(arr, m, mid) > m) {
                low = mid + 1;
            }
           
        }


        System.out.println(ans);
        
        
    }

    private static int canHoldBooks(int[] arr , int noStudents , int maxPages) {

       int sum = arr[0] ;
       int count = 1;

        for (int i = 1; i < arr.length; i++) {
             
           sum = sum + arr[i];

           if (sum > maxPages){

            sum = arr[i];
            count++ ;
            
           }

            

        }

        

       return count;
    }

    private static int maxVal(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }


        return max;
    }
    private static int sum(int[] arr) {
        int sum = 0 ;

        for (int i : arr) {
            sum+=i;
        }

        return sum;
    }


}
