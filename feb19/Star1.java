package feb19;


import java.util.Scanner;

/***
 *
 * star pattern
 *       * * * * *
 *       * * *
 * * *
 * *
 *
 *
 * */
public class Star1 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j, k;
        for(i=n;i>=1;i--)
        {
            for(j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

