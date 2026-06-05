public class FindOutArrayRotaions {
    
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};

        int low  = 0 ;
        int high = arr.length - 1;
        int ans =  Integer.MAX_VALUE;
        int index = -1 ;

        while(low <=  high) {

            int mid  = low + ((high - low)/ 2);

            if (arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    ans = arr[low] ;
                    index = low ;
                }

                low = mid + 1 ;
            }

            else {

                    if (ans > arr[mid]) {
                        ans = arr[mid] ;
                        index = mid ;
                    }

                    high =mid-1 ;
                
            }
        }

        System.out.println(ans + " " + index);
    }
}
