package aprilpractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Combinations {

    /*
     * Complete the calculateCombinations function below.
     */
    static long calculateCombinations1(int n, int k) {
        /*
         * Write your code here.
         */
        long res=1;
        if (n >= k) {
            long up=getFactorial(n);
            System.out.println(up);
            long d1=getFactorial(n - k);
            System.out.println(d1);
            long d2=getFactorial(k);
            System.out.println(d2);
            //res = getFactorial(n) / (getFactorial(n - k) * getFactorial(k));
            res= up/(d1*d2);
        } else
            System.out.println("r cannot be greater than n");

        return res;
    }

    public static long getFactorial(int n)
    {
        int i=1;
        long fact=1;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        return fact;
    }

    static int calculateCombinations(int n , int r)
    {
        if( r== 0 || n == r)
            return 1;
        else
            return calculateCombinations(n-1,r)+calculateCombinations(n-1,r-1);
    }


    public static long combinationFormula( int Y, int X )
    {
        BigInteger factorialYminusX = new BigInteger( "1" );
        BigInteger factorialY = new BigInteger( "1" );
        BigInteger factorialX = new BigInteger( "1" );

        for ( long i = Y; i > 1; i-- )
        {
            factorialY = factorialY.multiply( BigInteger.valueOf( i ) );
        }

        for ( long i = X; i > 1; i-- )
        {
            factorialX = factorialX.multiply( BigInteger.valueOf( i ) );
        }

        int yMinusX = Y - X;

        for ( long i = yMinusX; i > 1; i-- )
        {
            factorialYminusX = factorialYminusX.multiply( BigInteger.valueOf( i ) );
        }

        BigInteger result = factorialY.divide( factorialYminusX.multiply( factorialX ) );

        return result.longValue();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        /*int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");*/
        int r=3;
        int n=10;
        long startTime = System.nanoTime();
        r=r > n-r?n-r:r;
        long res = combinationFormula(n, r);
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
        System.out.println(res);

        /*bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
}
