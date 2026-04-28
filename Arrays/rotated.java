public class rotated {
    
    static void rotatedArr(int[] arr , int axis) {

        for (int i = 0; i < axis; i++) {
            
            for (int j = 0; j < arr.length-1; j++) {
                
                int temp = arr[j] ;
                arr[j] = arr[j+1] ;
                arr[j+1] = temp ;
            }

            
        }

    }
    public static void main(String[] args) {
        
        int[] arr = {3,4,5,1,2};
        rotatedArr(arr, 3);

        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }   
}
