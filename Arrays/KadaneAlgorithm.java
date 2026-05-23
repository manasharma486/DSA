import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KadaneAlgorithm {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    int maxsum = Integer.MIN_VALUE;
    int sum = 0 ;
    int i = 0 ;
    int j = 0 ;
    Map <Integer , Integer> map = new HashMap<>();


    
    for (int k = 0; k < arr.length; k++) {

        sum += arr[k] ;

        if (sum > maxsum) {
            maxsum = sum ;
            j = k ;
        }
        
        if(sum == 0) {
            i = k ;
        }

        if (sum < 0) {
            sum = 0 ;
        }
        
    }

    for (int k = i; k <= j; k++) {
        System.out.print( arr[k] + " ");
    }
    
    System.out.print(" }} ");

        System.out.println(maxsum);





    } 
}
