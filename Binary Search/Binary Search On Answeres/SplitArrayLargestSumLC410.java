public class SplitArrayLargestSumLC410 {
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5} ;
        int k = 2 ;
        
        long low = maxVal(nums);
        long high = sum(nums);

        long ans = -1 ;

        while(low <= high) {
            long mid = low + (high - low)/2 ;

            if (noOfSubArraysForm(nums, mid) <= k){
                ans = mid;
                high = mid - 1 ;
            }

            else{
                low = mid + 1 ;
            }
        }


        System.out.println(ans);
        

    }

    private static int noOfSubArraysForm(int[] arr , long maxSumOfSubArrays ){

        int sum = arr[0] ;
        int count = 1 ;

        for (int i = 1; i < arr.length; i++) {
            
            sum+= arr[i];

            if (sum>maxSumOfSubArrays) {
                sum = arr[i];
                count ++;
            }
        }

        return count;
    } 

    private static int maxVal (int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max ;
    }

    private static long sum(int[] arr) {
        long sum = 0 ;
        for (int i : arr) {
            sum+= i ;
        }
        return sum;
    }
}
