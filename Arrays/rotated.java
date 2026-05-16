import java.util.Arrays;

public class rotated {
    
    static void rotatedArr(int[] arr , int axis) {

        for (int i = 0; i < axis; i++) {
            
            for (int j = 0; j < arr.length-1; j++) {
                
                int temp = arr[j] ;
                arr[j] = arr[j+1] ;
                arr[j+1] = temp ;
            }

            
        }

    }
    public static void main(String[] args) {
        
        int[] arr = {3,4,5,1,2};
        rotatedArr(arr, 3);

        System.out.println(SortedRotated(arr));
    } 


    static boolean SortedRotated(int [] arr){
    int[] nums = arr.clone();
    int[] nums2 = arr.clone();

    Arrays.sort(nums); // ascending

    // descending requires Integer[], not int[]
    Integer[] desc = Arrays.stream(arr).boxed().toArray(Integer[]::new);
    Arrays.sort(desc, (a, b) -> b - a);
        for (int i = 0; i < desc.length; i++) {
        nums2[i] = desc[i];
        }

        // optimization code 

    
        if (Arrays.equals(arr, nums) || Arrays.equals(arr, nums2))
            return true ;

        boolean flag = false ;
        int firstVal = arr[0];
        int index ;
        int left = 0 ;

        //searching the first value in our sorted array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == firstVal){
                index = i;
                while (index < nums.length)
                    {
                    
                    // swapping
                    int temp = nums[left] ;
                    nums[left] = nums[index];
                    nums[index] = temp ;
                    
                    // check
                    if(nums[left] == arr[left]){
                        flag = true ;
                    }
                    else if(nums[left] != arr[left]){
                        return false;
                    }

                    // updating the variables 
                    left ++ ;
                    index ++;
                }

               


                return flag ;
            }
        }


        return flag ;
    }

}
