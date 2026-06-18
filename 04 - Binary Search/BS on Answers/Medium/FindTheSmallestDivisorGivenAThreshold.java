public class FindTheSmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        
        int[] nums = {1,2,5,9};
        int threshold = 6 ;

        int ans = -1 ;
        int low = 1 ;
        int high = maxElement(nums);

        while(low <= high) {

            int mid = low + ((high - low)/2);

            long sum = divSum(nums, mid);



             if (sum <= threshold) {

                ans = mid;
                
                high = mid-1;
            }

            else{
               low = mid+1 ;
            }

        }

        System.out.println(ans);

        
    }

    private static int maxElement(int[] arr ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max ;
    }

    private static long divSum(int[] arr , int divisor) {
        long sum = 0 ;

        for (int element : arr) {
            sum += (element+divisor - 1)/divisor ;
        }

        return sum;
    } 


}
