
public class BasicHashing {
    
    public static int maxOfArr(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max= arr[i];
            }
        }
        return max+1; // adding 1 in the end because , hash array will keep the record of numbers in the index {num of arr == index of hash arr}
    }

    public static void main(String[] args) {
        int[]arr = {1,3,2,1,3} ;
        int[]hashArr = new int[maxOfArr(arr)];

        for (int i : arr) {
            hashArr[i]++;
        }

        // point to be noted , we cannot assign the value of an ARRAY not bigger than 10e6 in the main method
        // we can assign the value of an array upto 10e7 globally
        
        // the number that we wanna search in the array or to check how many times it got repeated in the array 
        int n = 3 ;

        if (n>hashArr.length-1){
            System.out.println(0);
        }
        else
            System.out.println(hashArr[n]);

    }

}
