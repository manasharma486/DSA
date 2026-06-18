// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

// Return the minimum integer k such that she can eat all the bananas within h hours.

public class KokoEatingBananasLC875 {
    
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 5 ;
        
        int low = 1 ;
        int high = findMax(arr);

      

        int k = -1 ;

       while(low <= high) {

        int mid = low + ((high - low)/2);
        int ans = findTime(arr, mid);
        
        if (ans <= h){
            k = mid ;
            high = mid-1 ;
        }

        else{
            low = mid + 1 ;
        }

       }

       System.out.println(k);
        
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max ;
    }

    private static int findTime(int[] arr , int k) {
        int time = 0 ;

        for (int i = 0; i < arr.length; i++) {
            double temp = (double) arr[i] / (double) k ;
            time+=  Math.ceil(temp);
        }

        return time;
    }
}
