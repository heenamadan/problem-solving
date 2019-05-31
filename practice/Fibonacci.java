package practice;

public class Fibonacci {


    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println(fib(n));
        System.out.println(getFibIterative(n));
    }


  /*  For n = 9
Output:34*/

    public static long getFibIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0;
        int second = 1;
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            result = second + first;
            first = second;
            second = result;
        }

        return result;
    }
}