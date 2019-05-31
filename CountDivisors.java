/**
 *
 * You have been given 3 integers - l, r and k. Find how many numbers between l and r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.

 Input Format
 The first and only line of input contains 3 space separated integers
 l,r,k

 Output Format
 Print the required answer on a single line.

 Constraints
 1≤l≤r≤1000 and
 1≤k≤1000

 SAMPLE INPUT
 1 10 1
 SAMPLE OUTPUT
 10
 */

import java.util.Scanner;

/**
 * Created by heena.madan on 31/05/17.
 */
public class CountDivisors {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int count=0;
        final int l=scan.nextInt();
        final int r=scan.nextInt();
        final int k=scan.nextInt();
        long startTime = System.currentTimeMillis();
        for(int i=l;i<=r;i++){
            if((i%k)==0){
                count++;
            }
        }
        System.out.println(+count);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);

    }

}