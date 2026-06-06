public class MinimumElementDuplicatesLC154 {
    
    public static void main(String[] args) {
        
        int[] arr = {2,2,2,0,1} ;
        int n = arr.length ; //5

        int low = 0 ; // 0
        int high = n-1 ; //4
        int ans = Integer.MAX_VALUE;

        while(low <= high) {

            int mid = low + ((high - low)/2);

            if (arr[low] <=  arr[mid]) {

                if (low < mid && arr[low] == arr[mid]) {
                    low ++ ;
                    continue ;
                }

                if (arr[low] < ans) {
                    ans = arr[low] ;
                }

            }

            else {

                if (arr[mid] == arr[high] && mid < high) {
                    high -- ;
                    continue ;
                }

                if (arr[mid] < ans) {
                    ans = arr[mid] ;
                }

            }
        }


        System.out.println(ans);
    }
}