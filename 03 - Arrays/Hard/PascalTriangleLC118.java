import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalTriangleLC118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt() ;

        List<List<Integer>> bigArr= new ArrayList<>();


        for (int i = 1; i <= n; i++) {

            List<Integer>arr= new ArrayList<>();

            for (int j = 0; j < i; j++) {
                
                if (i < 2) {
                     arr.add(1);
                }

                else{

                   if (j == 0 || j == i-1) {
                        arr.add(1);
                   }

                   else{
                    arr.add(bigArr.get(i-2).get(j-1) + bigArr.get(i-2).get(j));
                   }


                }


            }

            bigArr.add(arr) ;
            
        }


        for (List<Integer> list : bigArr) {
            System.out.println(list);
        }

    }
}
