import java.util.Arrays;
import java.util.Scanner;

public class NextPermutationLC31 {
    

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    int breakpoint = -1;

    for (int i = n-2; i >= 0 ; i--) { 

        if (arr[i] < arr[i+1]) {
            breakpoint = i ;
            break ;
        }


    }

    if (breakpoint == -1) {
        Arrays
    }

    for (int i = n-1; i >breakpoint ; i++) {
        if(arr[i] > arr[breakpoint]){
            swap;
        }
    }

    

    System.out.println(breakpoint);




    System.out.println(Arrays.toString(arr));
    

}



}
