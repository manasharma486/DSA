public class LinearSearch {

    static int search(int[] arr , int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i ;
            }
        }

        return -1 ;
    }
    public static void main(String[] args) {
        int[] arr = {12,25,8,10,32} ;
        System.out.println(search(arr, 8));
    }
}
