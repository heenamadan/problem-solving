import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static int maximumGcdAndSum(int[] A, int[] B) {
        final Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++) {
            findGCD(B, A[i], map);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByKey()).getValue();
    }

    static void findGCD(int arr[], int n, final Map<Integer,Integer> map) {
        int res= 0;
        for (int i=0; i<arr.length; i++) {
            res = gcd(arr[i], n);
            if(!map.containsKey(res))
            map.put(gcd(arr[i], n), arr[i] + n);
        }
    }

    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b%a, a);
    }



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
