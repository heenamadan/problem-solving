import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Lucky {

    static String onceInATram(int x) {
        for(int i =1;i<1000000;i++){
            String s= String.valueOf(x+i);
            int a = Integer.parseInt(s.substring(0, 3));
            int b = Integer.parseInt(s.substring(3));
            if(sd(a) == sd(b)){
                return s;
            }
        }

        return null;
    }

    static int sd(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String result = onceInATram(x);
        System.out.println(result);
    }
}