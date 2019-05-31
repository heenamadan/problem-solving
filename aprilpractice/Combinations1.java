package aprilpractice;

import java.util.Scanner;

public class Combinations1 {

    public static int fact(int num)
    {
        int fact=1, i;
        for(i=1; i<=num; i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
        return fact;
    }
    public static void main(String args[])
    {
        int n, r;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Value of n : ");
        n = scan.nextInt();
        System.out.print("Enter Value of r : ");
        r = scan.nextInt();
        if(r >n-r){
            r= n-r;

        }

        System.out.print("NCR = " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.print("\nNPR = " +(fact(n)/(fact(n-r))));
    }
}
