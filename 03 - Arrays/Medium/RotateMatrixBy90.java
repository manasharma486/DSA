import java.util.Arrays;

public class RotateMatrixBy90 {
    
    public static void main(String[] args) {
        int[][] matrix = { {5,1,9,11} , {2,4,8,10} , {13,3,6,7} , {15,14,12,16} } ;

        int m = matrix.length ;
        int n = matrix[0].length ;
        int jPointer = 0 ;

        for (int i = 0; i < m; i++) {
            int iPointer = 0 ;
            
            reverse(matrix[i]);

            for (int j = m-1; j > i; j--) {
                int temp = matrix[j][jPointer];
                matrix[j][jPointer] = matrix[i][iPointer] ;
                matrix[i][iPointer] = temp ;

                iPointer ++ ;
            }

            jPointer ++ ;
           
        }


            for (int[] is : matrix) {
                System.out.println(Arrays.toString(is));
            }


    }

    private static void reverse(int[] arr){

        int left = 0 ;
        int right = arr.length-1 ;

        while(left < right) {

            int temp = arr[right] ;
            arr[right] = arr[left] ;
            arr[left] = temp ;
            
            left ++ ;
            right -- ;
        }

    }


    
}
