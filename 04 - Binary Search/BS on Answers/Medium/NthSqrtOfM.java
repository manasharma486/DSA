public class NthSqrtOfM {
    public static void main(String[] args) {
        int num = 25 ;
        int n = 2 ;
        int low = 1 ;
        int high = num/n;
        int ans = -1 ;

        while(low <= high){
            int mid = low + ((high-low)/2);
            int i = 1 ;
            int product=1;
            while(i <= n) {
                product*=mid; 
                i++ ;
            }

            if (product == num){
                ans = mid ;
                break;
            }

            else if (product < num) {
                low = mid + 1 ;
            }
            
            else{
                high = mid-1 ;
            }
        }

        System.out.println(ans);

    }
}
