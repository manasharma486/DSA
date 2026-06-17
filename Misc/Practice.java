import java.util.Arrays;

public class Practice {
    
  public static void main(String[] args) {
    
    int [] arr = {12, 34, 67, 90};
    int k = 2;

    int low = max(arr) ;
    int high = sum(arr);
   
    int ans = -1;

    while(low <= high){
      int mid = low + (high-low)/2;

      if (numberofStudentsNeededInorderToholdthebooks(arr, mid) <= k){
        ans = mid;
        high = mid-1;
      }

      else{
        low = mid + 1 ;
      }
    }


    System.out.println(ans);

    
  }

  private static int max(int[]arr ){
    int max= Integer.MIN_VALUE;
    for (int i : arr) {
      if (max < i) {
        max = i;
      }
    }

    return max;
  }

  private static int sum(int[] arr){
    int sum = 0 ;

    for (int i = 0; i < arr.length; i++) {
      sum+= arr[i];
    }
    return sum;
  }

  private static int numberofStudentsNeededInorderToholdthebooks(int[] arr , int maxPages){

    int sum = arr[0];
    int studCount = 1 ;

    for (int i = 1; i < arr.length; i++) {
      sum+=arr[i];

      if (sum > maxPages){
        sum= arr[i];
        studCount++ ;
      }
    }
  


    return studCount;
  }

  

  
}