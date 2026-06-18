import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroLC73 {

    public static void main(String[] args) {
        int[][] matrix = { {1,1,1} , {1,0,1} , {1,1,1} } ;

        boolean row[] = new boolean[matrix.length];
        boolean col[] = new boolean[matrix[0].length];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = true ;
                    col[j] = true ;
                }
            }
        }

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                if (row[i] || col[j]){
                    matrix[i][j] = 0 ;
                }
            }
        }


        for (int[] b : matrix) {
            System.out.println(Arrays.toString(b));
        }


    }
    
}
