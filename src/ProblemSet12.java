import java.util.ArrayList;

public class ProblemSet12 {
    public static void main(String[] args) {

        int [] data = {1,2,11};

        System.out.println(factorial(3));
    }
    public static long factorial(int n) {
        if (n < 0){
            return -1;
        } else{
            if( n == 0){
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }

    /*public long fibonacci(int n) {

    }

    public long triangle(int rows) {

    }

    public long sumDigits(int n) {

    }

    public long powerN(int base, int exponent) {

    }

    public String changeXY(String text) {

    }

    public int array11(int[] data, int index) {

    }

    public int strCount(String text, String sub) {

    }

    public boolean strCopies(String text, String sub, int n) {

    }

    public int strDist(String text, String sub) {

    }*/
}
