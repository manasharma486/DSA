import java.util.ArrayList;
import java.util.List;

public class CountInversionsInAnArray {

    static int inversion = 0;
    public static void main(String[] args) {
        int [] arr = {5,3,2,1,4} ;

        mergeSort(arr , 0 , arr.length-1);

        System.out.println(inversion);
     }

     private static void mergeSort(int [] arr , int low , int high) {
        if (low >= high) return ;
        int mid = (low + high)/2 ;
        mergeSort(arr, low, mid);;
        mergeSort(arr, mid+1, high);
        merge(arr , low , mid , high);
     }

     

     private static void merge(int[] arr , int low , int mid , int high) {

        int left = low ;
        int right = mid+1 ;

        List<Integer> temp = new ArrayList<>() ;

        while(left <= mid && right <= high ) {

            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++ ;
            }
            else {
                temp.add(arr[right]);
                inversion+= (mid-left+1);
                right ++ ;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++ ;
        }

        while(right <= high) {
            temp.add(arr[right]);
            right ++ ;
        }

        for (int i = low; i <= high ; i++) {
            arr[i] = temp.get(i-low);
        }
     }
}
