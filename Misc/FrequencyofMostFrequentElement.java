import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyofMostFrequentElement {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4};
        int k = 5;

        Arrays.sort(nums);

        long sum = 0;
        int left = 0;
        int maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right]; //1

            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        Map<Integer , Integer> hashMap = new HashMap<>() ;
        
        
        System.out.println(maxFreq);
    }
}