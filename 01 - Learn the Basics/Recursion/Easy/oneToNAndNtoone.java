
public class oneToNAndNtoone {

    static int c1 = 0;
    static int c2 = 0;

    static void oneToN(int nums) {

        if (c1 >= nums) {
            return;
        }

        else {

            c1++;
            System.out.print(" " + c1 + " ");

            oneToN(nums);
        }
    }

    static void NtoOne(int nums) {

        if (c2 > nums - 1) {
            return;
        } else {

            System.out.print(" " + (nums - c2) + " ");
            c2++;
            NtoOne(nums);

        }
    }

    public static void main(String[] args) {
        oneToN(10);
        System.out.println(" ");

        NtoOne(10);
    }
}
