public class MaxAndMinimumElement {

    static int findmax(int[] arr) {
        int max =Integer.MIN_VALUE ;


        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    static int findmin(int[] arr) {
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        
        int[] arr = {45,20,65,85,42,78};
        System.out.println(findmax(arr));
        System.out.println(findmin(arr));
    }
    
}
