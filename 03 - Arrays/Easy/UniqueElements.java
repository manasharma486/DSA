import java.util.Arrays;

public class UniqueElements {
    
    public static void main(String[] args) {
        int[]arr = {4,5,28,16,1,1,1,2,2,2,3,3,3} ;
        Arrays.sort(arr);
        int left = 0 ;
    

        System.out.println(Arrays.toString(arr));
        
        for (int right = 1; right < arr.length  ; right++) {
            
            if (arr[right] != arr[left]) {
                arr[left+1] = arr[right];
                left++ ;
            }

            
        }
        
        System.out.println(Arrays.toString(arr) + " " + (left+1));
    }
}
