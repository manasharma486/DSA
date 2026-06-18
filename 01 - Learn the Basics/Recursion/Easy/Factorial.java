
public class Factorial {

    static long fact(int nums) {

        if (nums == 1) {
            return 1;
        }

        return nums * fact(nums - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(20));
    }
}
