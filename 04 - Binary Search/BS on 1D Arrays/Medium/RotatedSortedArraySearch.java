public class RotatedSortedArraySearch {
    public static void main(String[] args) {
        int [] arr ={4,5,6,7,0,1,2} ;
        int x= 0 ;
        int n = arr.length;


        int ans = -1 ;
        int low = 0 ;
        int high = n-1;

        while(low <= high){

            int mid = high - ((high-low)/2);

            if (arr[mid] ==  x){
                ans = mid ;
                
            }

            if (arr[low] < arr[mid]) {

                if (arr[low] <= x && arr[mid] > x) {
                    high = mid-1 ;
                }

                else{
                    low = mid + 1 ;
                }
            }

            else {

                if (x > arr[mid] && x <= arr[high]) {
                     low = mid + 1;
                }
               
                else
                    high = mid - 1;
            }
        }


        System.out.println(ans);
    }
}
