public class Pow {
    public static void main(String[] args) {
        double x = 2.0 ;
        int num = -2 ;
        if (num < 0) {
            System.out.println(1/(pospow(x, (-1*num))));
        }
        else {System.out.println(pospow(x,num));}
        
    }

    private static double pospow(double x , int num ) {

        
        if (num == 0) {
            return 1 ;
        }

        return ( x * pospow(x, num-1) * 100000)/100000;
    }

    
}
