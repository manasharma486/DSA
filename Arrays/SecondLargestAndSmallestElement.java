
public class SecondLargestAndSmallestElement {

    
    

    public static void main(String[] args) {

        int arr[] = { 5,1,4 };

        System.out.println(secondLargest(arr) + " " + secondSmallest(arr));

    }

    private static int secondSmallest(int[] arr) {
        // TODO Auto-generated method stub
        int min = Integer.MAX_VALUE ;
        int secondMin = -1 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                secondMin = min ;
                min = arr[i] ;
            }
            else if (arr[i] < secondMin && arr[i] != min )
                secondMin = arr[i] ;
        }
        return secondMin;
    }

    private static int secondLargest(int[] arr) {
        // TODO Auto-generated method stub
        int max = Integer.MIN_VALUE ;
        int secondMax = -1 ;
        for (int i = 0; i < arr.length; i++) {
            
            if (max < arr[i]){
                secondMax = max;
                max  = arr[i];
                
            }
            else if (arr[i] > secondMax && arr[i] != max)
                secondMax = arr[i];
        }
        return secondMax ;
    }
}

