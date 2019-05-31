import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution2 {

    static int maximumGcdAndSum(int[] A, int[] B) {
        final Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            findGCD(B, A[i], map);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByKey()).getValue();
    }

    static void findGCD(int arr[], int n, final Map<Integer,Integer> map) {
        for (int i=0; i<arr.length; i++) {
            int no =arr[i];
                map.put(gcd(no, n), no + n);
        }
    }

    /*static int gcd(int a,int b)
    {
        int min=a>b?b:a,max=a+b-min, div=min;
        for(int i=1;i<min;div=min/++i)
            if(min%div==0&&max%div==0)
                return div;
        return 1;
    }*/

    /*public static int gcd(int a, int b){
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }*/
    /*private static int gcd(int number1, int number2) {
        if(number2 == 0){ return number1; }
        if(number1 == 0){ return number2; }
        if(number1==number2)return number1;
        if (number1 < 0) return gcd(-1 * number1, number2);
        if (number2 < 0) return gcd(number1, -1 * number2);
        if (number1 > number2) return gcd(number2, number1);
        return gcd(number2, number1%number2); }*/

    static int gcd(int m,int n)
    {
        if(n==0)
            return m;
        else if(m==0)
            return n;
        else if(m==n){
            return m;
        }
        else{
            int t=0;
            while(n!=0){
                t=n;
                n=m%n;
                m=t;
            }
            return m;
        }
    }

    /*private static int gcd(int m, int n){
        int r = 0;
        while((r = m % n) != 0){
            m = n;
            n = r;
        }
        return n;
    }*/

   /* static int gcd(int x, int y)
    {

        if(x==0){
            return y;
        }
        else if(y==0){
            return x;
        }
        else if(y==x){
            return x;
        }
        else {
            int r = 0;
            while((r = x % y) != 0){
                x = y;
                y = r;
            }
            return y;
        }
    }*/



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        long startTime = System.currentTimeMillis();
        int res = maximumGcdAndSum(A, B);
        System.out.println(res);
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println(duration);
    }
}
