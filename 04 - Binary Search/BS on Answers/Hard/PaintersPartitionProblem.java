public class PaintersPartitionProblem {
    public static void main(String[] args) {
        
        int[] boards = {10, 20, 30, 40} ;
        int k = 2 ;

        int low = maxVal(boards);
        int high = sum(boards);

        int ans = -1 ;

       

        while(low <=  high) {

            int mid = low + (high - low)/2 ;

            if (countPainters(boards, mid) <= k) {
                 ans = mid ;
                 high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }


        System.out.println( ans );
        
    }

    private static int countPainters(int[] arr , int time ) {
        int sum = arr[0] ;
        int count = 1 ;

        for (int i = 1; i < arr.length; i++) {
            
            sum += arr[i];

            if (sum > time) {
                sum = arr[i];
                count ++ ;
            }
        }

        return count;
    }

    private static int  maxVal(int[] arr) {
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

        for (int i = 0; i < arr.length; i++) {
            
            sum+= arr[i];
        }

        return sum;
    }
}
