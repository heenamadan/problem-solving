package chegg;

import java.util.Scanner;


/**
 * Dependencies: StdIn.java StdOut.java
 * Read in integers from standard input and print out the maximum and
 *  minimum values.
 *
 */

public class MinMax {
    public static void main(String [] args) {
        // creates the scanner
        Scanner input = new Scanner(System.in);

        int number;
        int max=0;
        int min=0;
        int counter = 0;

        do {
            System.out.println("enter");
            //System.out.print("Enter a positive integer (enter -1 to end): ");
            number = input.nextInt();

            if (number> max ){
                number = max;
            }
            else if (number<max ) {
                number = min;
            }
        }
        while ( number !=-1);
        System.out.println("max value is " +max);
        System.out.println("min value is "+min);
    }
}

