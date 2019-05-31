package practice;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by heena.madan on 03/09/17.
 */
public class TopTwoMaxNumbers {
    public static void main(String a[]) {

        int num[] = {5, 34, 78, 2, 45, 1, 99, 23};
        Arrays.sort(num);//asc order

        System.out.printf("Modified arr[] : %s",
                Arrays.toString(num));
        System.out.println("top two are:"+ num[num.length-1] +" and "+ num[num.length-2]);
    }
}
