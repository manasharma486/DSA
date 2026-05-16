public class MissingNumber {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        System.out.println("Missing Number : " + missingNumb(arr));
    }
    private static int missingNumb(int[] arr){
        int n = arr.length +1 ;
        int sum1 = 0;
        int sum2 = 0 ;

        for (int i = 0; i < n-1; i++) {
            sum1+=  arr[i];
            
        }

        sum2 = n * (n + 1) / 2;

        return sum2-sum1 ;
    }
    
}
