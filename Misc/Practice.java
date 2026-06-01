import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
    
  public static void main(String[] args) {
     
   int [] arr = {1,0,-1,0,-2,2};
   int target =0 ;
    
   List<List<Integer>>ans = new ArrayList<>();


   Arrays.sort(arr);

   for (int i = 0; i < arr.length; i++) {

    if (i > 0  && arr[i] == arr[i-1]) {
      continue ;
    }


      for (int j = i+1; j < arr.length; j++) {

        if (j > i +1 && arr[j] == arr[j-1]) {
          continue ;
        }
        
        int left = j+1 ;

        int right  = arr.length-1 ;


        while(left < right) {
          int sum = arr[i] + arr[j] +arr[left] +arr[right] ;

          if (sum < target) {
            left++ ;
          }

          else if (sum > target) {
            right -- ;
          }

          else {
            List<Integer>temp = new ArrayList<>() ;
            temp.add(arr[i]);
            temp.add(arr[j]);
            temp.add(arr[left]);
            temp.add(arr[right]);

            ans.add(temp);
            left++ ;
            right-- ;

            while(left<right && arr[left] == arr[left-1]) {
              left++ ;
            }
            while(left < right && arr[right] == arr[right+1]){
              right-- ; 
            }
          }
        }
      }
   }


   for (List<Integer> list : ans) {
      System.out.println(list);
   }

  }


}
