

public class FloorAndCeilInArray {
    
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10} ;
        int x  = 8 ;

        int low = 0 ;
        int high = arr.length-1 ;
        int floor = arr.length ;
        int ceil = arr.length ;

        while(low <=  high) {
            int mid = (low + high) / 2 ;
            
            if (arr[mid] <= x) {
                floor = arr[mid] ;
                low = mid + 1 ;
            }

            if (arr[mid] >= x) {
                ceil = arr[mid] ;
                high = mid - 1 ;
            }

            
        }

        System.out.println(floor + " " + ceil );
    }
}
