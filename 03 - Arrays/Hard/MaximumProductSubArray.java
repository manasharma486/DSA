import java.util.HashMap;
import java.util.Map;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int [] arr = {2,3,-2,4 , -8 , -1} ;

       
        int prefixProduct = 1 ;
        int  suffixProduct = 1;
        int MaxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            
            if (prefixProduct == 0){
                prefixProduct = 1 ;
            }
            if (suffixProduct == 0){
                suffixProduct = 1 ;
            }
            
            prefixProduct *= arr[i] ;
            suffixProduct *= arr[(arr.length-1) - i] ;

            MaxProduct = Math.max(MaxProduct, Math.max(prefixProduct, prefixProduct));
        }

        System.out.println(MaxProduct);

    }
}