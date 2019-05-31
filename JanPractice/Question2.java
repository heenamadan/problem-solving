/*
package JanPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

public class Question2 {
    static int i=5;

    Question2(){
        static int i=0;
        System.out.println("i---"+i++);
        System.out.println(i);

    }

    static List<Integer> values = new ArrayList<Integer>();

    public static void main(String[] args) {
        Question2 y= new Question2();

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
*/
