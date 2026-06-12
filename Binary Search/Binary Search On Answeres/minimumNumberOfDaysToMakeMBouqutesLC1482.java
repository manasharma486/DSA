import java.util.Arrays;

public class minimumNumberOfDaysToMakeMBouqutesLC1482 {
    public static void main(String[] args) {
        
        int[] bloomDay = {1,10,3,10,2};
        int m = 3 ;
        int k = 2 ;

        int ans = -1 ;

        // if (m*k > bloomDay.length) {
        //    return -1 ;
        // }

        int low = minElement(bloomDay);
        int high = maxElement(bloomDay);



        while(low <= high) {

            int mid = low + ((high-low)/2);

            int bouqeFormed = countBouqutes(bloomFlowers(bloomDay, mid), k, m);

            if (bouqeFormed >= m) {

                ans = mid ;
                high = mid -1 ;
            }

            else{
                low =  mid + 1 ;
            }

        }


        System.out.println(ans);

        


    }

    private static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
    private static int maxElement(int[]arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    private static boolean[] bloomFlowers(int[] arr , int day) {
        boolean[] flower = new boolean[arr.length];

        for (int i = 0; i < flower.length; i++) {
            if (arr[i] <= day) {
                flower[i] = true;
            }
        }


        return flower;
    }

    private static int countBouqutes(boolean[] arr , int k , int m) {

        int count = 0 ;
        int bouqCount = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]){
                count ++ ;
            }

           else{
            bouqCount += (count/k);
            count = 0;
           }

        }

        bouqCount += count/k ;

        



        return bouqCount;
    }
}
