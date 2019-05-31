import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    static int maximumGcdAndSum(int[] A, int[] B) {
        final Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            findGCD(B, A[i], map);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByKey()).getValue();
    }

    static void findGCD(int arr[], int n, final Map<Integer,Integer> map) {
        for (int i=0; i<arr.length; i++) {
            map.put(arr[i], arr[i] + n);
        }
    }
    static int gcd(int x, int y)
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
    }

    /*private static int gcd(int number1, int number2) {
        if(number2 == 0){ return number1; }
        if(number1 == 0){ return number2; }
        if(number1==number2)return number1;
        return gcd(number2, number1%number2); }*/


    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] B = new int[n];
        for(int B_i = 0; B_i < n; B_i++){
            B[B_i] = in.nextInt();
        }
        int res = maximumGcdAndSum(A, B);*/
        final Map<String,String> map = new HashMap<>();
        map.put("heena","12");
        //map.put("heena1","12");
        map.get("heena1");

        //System.out.println(res);
    }
}