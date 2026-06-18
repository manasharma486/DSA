import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FourSumLC18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            
            if (i > 0 && arr[i] == arr[i-1]) {
                continue ;
            }

            for (int j = i+1; j < arr.length; j++) {

                if (j > i +1 && arr[j] == arr[j-1]) continue;
                
                int left = j+1 ;
                int right = arr.length - 1 ;

 

                while(left < right) {
                int sum  = arr[i] + arr[j] + arr[left] + arr[right] ;
                    if (sum == target) {
                    ans.add(Arrays.asList(arr[i] , arr[j] , arr[left] , arr[right]));

                    left ++ ;
                    right -- ;


                    while(left<right && arr[left] == arr[left-1]){
                        left++;
                    }

                    while(left < right && arr[right] == arr[right+1]) {
                        right-- ;
                    }
                }

                else if (sum < target) {
                    left++ ;
                }

                else if (sum > target) {
                    right -- ;
                }
                }

            }
        }


        System.out.println(ans);
    }

}
