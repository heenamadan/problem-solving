package hackerrank.datastructure;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by heena.madan on 02/09/17.
 */


public class uglyOrBeautiful {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            String result = uglyOrBeautiful(a);
            System.out.println(result);
        }
        in.close();
    }

    static String uglyOrBeautiful(int[] a) {
        Set<Integer> mySet = Arrays.stream(a).boxed().collect(Collectors.toSet());
        if(a.length == mySet.size()){
            if(!isSorted(a)){
                    if (!check(a)){
                        return "Beautiful";
                    }
            }
        }
        return "Ugly";
    }

     static boolean isSorted(int[] data){
        for(int i = 1; i < data.length; i++){
            if(data[i-1] > data[i]){
                return false;
            }
        }
        return true;
    }

     static boolean check(int a[]){
        int len =a.length;
        for(int i=0;i<len;i++){
            if (!between(a[i], 1, len)) {
                return true;

            }
        }
        return false;
        }


    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        return (i >= minValueInclusive && i <= maxValueInclusive);
    }
}
