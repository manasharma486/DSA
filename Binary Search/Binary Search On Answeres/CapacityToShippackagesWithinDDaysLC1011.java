public class CapacityToShippackagesWithinDDaysLC1011 {
    
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10} ;

        int days = 5 ;
        int ans = -1;

        int low = maxVal(weights);
        int high = sum(weights);

        while(low <= high) {
            int mid = low + ((high-low)/2);

            if (calcDays(weights, mid) <= days) {
                ans = mid;
                high = mid-1 ;
            }

            else{
                low = mid + 1;
            }
        }


        System.out.println(ans);
    }

   private static int calcDays(int[] arr, int capacity) {
    int days = 1;
    int load = 0;

    for (int weight : arr) {
        if (load + weight > capacity) {
            days++;
            load = weight;
        } else {
            load += weight;
        }
    }

    return days;
}

private static int maxVal(int[] arr) {
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (max < arr[i]) {
            max = arr[i];
        }
    }

    return max;
}
private static int sum(int[] arr) {
    int sum = 0;
    for (int x : arr) {
        sum += x;
    }
    return sum;
}

}