
public class Table {
    static int i = 0;

    static void table(int num) {

        if (i >= 10) {

            return;
        }

        else {

            i++;
            System.out.println(num + " * " + i + " = " + (num * i));

            table(num);
        }
    }

    public static void main(String[] args) {
        table(365);
    }
}
