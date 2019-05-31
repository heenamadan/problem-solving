package JanPractice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class fabonacciSeries {


    static List<Integer> values = new ArrayList<Integer>();

    public static void main(String[] args) {
        final Date PAST_DATE = new Date(1008672297379L);
        System.out.println(PAST_DATE);

        System.out.println(fibonacciAvg(5));

    }


    public static OptionalDouble fibonacciAvg(int n) {
        calculateSum(5);
        System.out.println(values.size());
        return values.stream().mapToInt(Integer::intValue).average();
    }


    static int calculateSum(int n)
    {
        if (n <= 0)
            return 0;

        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;
        //values.add(fibo[0]);
        values.add(fibo[0]+fibo[1]);

        for (int i=2; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            values.add(fibo[i]);
        }

        return 0;
    }






}
