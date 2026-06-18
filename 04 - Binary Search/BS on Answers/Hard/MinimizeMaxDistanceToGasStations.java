public class MinimizeMaxDistanceToGasStations {
    
    public static void main(String[] args) {
        
        int arr[] = {3, 6, 12, 19, 33, 44, 67, 72, 89, 95};
        int k = 2 ;

        System.out.println(maxDis(arr));
    }

    private static int maxDis(int[] arr) {

        int max = Integer.MIN_VALUE;
        int diff ;

        for (int i = 0; i < arr.length - 1 ; i++) {
            
            diff = arr[i+1] - arr[i];

            if (diff > max) {
                max = diff ;
            }
        }
        return max;
    }
}
