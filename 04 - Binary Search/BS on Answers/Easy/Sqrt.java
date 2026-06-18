public class Sqrt {
    public static void main(String[] args) {
        
        int num = 36 ;

        int low = 1 ;
        int high = num/2 ;
        int ans =-1;

        while(low <= high) {
            int mid = low + ((high-low)/2);
            int square = mid*mid ;

            if (square <= num){
                ans = mid ;
                low = mid+1;
            }

            else if  (square > num ){
                high = mid-1 ;
            }
        }

        System.out.println(ans);
    }
}
