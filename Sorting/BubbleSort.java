public class BubbleSort {
    
    public static void sort(int[] arr){

        int n = arr.length - 1;

        for (int i = 0; i < n; i++) { // number of times the window is going to run on the array
            
            for (int j = 0; j < n-i; j++) { //adjacent window comparison loop
                

                int temp ;
                
                if (arr[j] > arr[j+1]) {
                    temp =  arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;

                }

                else 
                    continue;

            }
           
        }
    }

    public static void main(String[] args) {
        
        int [] arr = {13,46,24,52,20,9};
        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
