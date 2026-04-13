
public class SumOfN {

    static int sum = 0;

    static int Nsum(int nums) {

        if (nums == 1) {
            return 1;
        }

        return nums + Nsum(nums - 1);
    }

    public static void main(String[] args) {
        System.out.println(Nsum(50));
    }

}
