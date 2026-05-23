import java.util.Arrays;
import java.util.Scanner;

public class RearrangeArrayElementsBySignLC2149 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }


    int[] posArr = new int[arr.length/2];
    int posArrPointer = 0 ;
    int negArrPointer = 0 ;
    int[] negArr = new int[arr.length/2];
    int[] finalArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > 0) {
            posArr[posArrPointer] = arr[i] ;
            posArrPointer ++ ; 
        }

        else {
            negArr[negArrPointer] = arr[i] ;
            negArrPointer ++ ;
        }
    }

    posArrPointer = 0 ;
    negArrPointer = 0 ;

    for (int i = 0; i < finalArr.length; i++) {

        if ( i % 2 == 0) {

            finalArr[i] = posArr[posArrPointer];
            posArrPointer ++ ;
        }

        else {
            finalArr[i] = negArr[negArrPointer];
            negArrPointer ++ ;
        }
        
        
    }

    System.out.println(Arrays.toString(finalArr));
}



}