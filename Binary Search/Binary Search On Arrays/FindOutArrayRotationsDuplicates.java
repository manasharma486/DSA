public class FindOutArrayRotationsDuplicates {
    

    // to find the number of rotations we just have to find the index of the min element !! thats it !!
    public static void main(String[] args) {
        int[] arr = {10,1,10,10,10} ;

        int low = 0 ;
        int high = arr.length-1 ;
        int ans = Integer.MAX_VALUE ;
        int index = - 1;

        while(low<=high) {

            int mid  = low + ((high - low)/2) ;

            if (arr[low] <= arr[mid]) {

                if (arr[low] == arr[mid] && low < mid) {
                    low++ ;
                    continue;
                }

                if (ans> arr[low]) {
                    ans = arr[low];
                    index = low ;
                }

                low = mid+1 ;
            }

            else{

                if(arr[mid] == arr[high] && mid < high) {
                    high -- ;
                    continue ;
                }

                if (arr[mid] < ans) {
                    ans = arr[mid] ;
                    index = low ;
                }

                high =  mid-1 ;
            }
        }

        System.out.println(ans + " " + index);
    }
}
