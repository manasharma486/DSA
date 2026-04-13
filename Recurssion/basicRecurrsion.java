public class basicRecurrsion {

    static int nums = 10;
    static int i = 0;

    static void name() {

        if (i >= nums) {

            return;
        }

        else {

            i++;
            System.out.print("Manas Sharma " + i + " ");
            name();
        }

    }

    public static void main(String[] args) {
        name();
    }
}