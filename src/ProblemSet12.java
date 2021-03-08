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

    public static long fibonacci(int n) {
        long fib = 0;
        if (n < 0){
            return -1;
        } else {
            if ( n == 0 || n == 1){
                return n;
            }
            fib = fibonacci(n - 1) + fibonacci(n -2);
        }
        return fib;
    }

    public static long triangle(int rows) {
        long row;
        if( rows < 0){
            return -1;
        } else {
            if ( rows == 0 || rows == 1){
                return rows;
            }
            row = triangle( rows - 1) +2;
        }
        return row;
    }

    public static long sumDigits(int n) {
        long sum;
        if (n < 0){
            return -1;
        } else {

            if (n < 10){
                return n;
            }
            sum = n % 10 + sumDigits(n / 10);
        }
        return sum;
    }

    public static long powerN(int base, int exponent) {
        long value;
        if( base < 1 || exponent < 1){
            return -1;
        } else {
            if (exponent == 1){
                return base;
            }
            value = base * powerN(base, exponent - 1);
        }
        return value;
    }

    public static String changeXY(String text) {
        if( text == null){
            return null;
        } else {
            if( text.length() == 0){
                return text;
            }
            if (text.charAt(0) == 'x'){
                return 'y' + changeXY(text.substring(1));
            }
            return text.charAt(0) + changeXY(text.substring(1));
        }
    }

    public static int array11(int[] data, int index) {

        if(data == null || index < 0|| index >= data.length ){
            return -1;
        } else {
            if(index >= data.length){
                return 0;
            }
            if(data[index] == 11){
                return 1 + array11(data , index +1);
            }
            return array11(data , index +1);
        }
    }

    public int strCount(String text, String sub) {

    }

    public boolean strCopies(String text, String sub, int n) {

    }

    public int strDist(String text, String sub) {

    }*/
}
