package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 30/07/17.
 */
public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int value = a;
            for(int j=0;j<n;j++){
                value += (int)(Math.pow(2,j)*b);
                System.out.print(value+ " ");
            }
            System.out.println();
        }
        in.close();
    }
}
