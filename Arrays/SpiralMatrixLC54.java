import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixLC54 {
    
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        List<Integer> spiralMatrix = new ArrayList<>();

        int turn = 0;
        int reverseInd = 0;

        int rightBorder = 0;
        int leftBorder = 0;
        int upperBorder = 0;
        int lowerBorder = 0;

        int shift = 0;

        while (shift != (Math.min(matrix.length, matrix[0].length) + 1) / 2) {

            // left -> right
            for (int i = leftBorder; i < matrix[0].length - rightBorder; i++) {

                spiralMatrix.add(matrix[upperBorder][i]);

                if (i == matrix[0].length - rightBorder - 1) {
                    turn = i;
                }
            }

            upperBorder++;

            // top -> bottom
            for (int i = upperBorder; i < matrix.length - lowerBorder; i++) {

                spiralMatrix.add(matrix[i][turn]);

                if (i == matrix.length - lowerBorder - 1) {
                    reverseInd = i;
                }
            }

            rightBorder++;

            // right -> left
            if (upperBorder <= matrix.length - 1 - lowerBorder) {

                for (int i = matrix[reverseInd].length - 1 - rightBorder; i >= leftBorder; i--) {

                    spiralMatrix.add(matrix[reverseInd][i]);

                    if (i == leftBorder) {
                        turn = i;
                    }
                }
            }

            lowerBorder++;

            // bottom -> top
            if (leftBorder <= matrix[0].length - 1 - rightBorder) {

                for (int i = matrix.length - 1 - lowerBorder; i >= upperBorder; i--) {

                    spiralMatrix.add(matrix[i][turn]);
                }
            }

            leftBorder++;

            shift++;
        }

        System.out.println(spiralMatrix);
    }
}
