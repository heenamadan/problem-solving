package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 30/07/17.
 */
/*
Problem Statement
Java System.out.printf function allowes you to print formatted output. This problem will test your knowledge on this topic.
Take exactly 3 lines of input. Each line consists of a string and an integer. Suppose this is the sample input:
java 100
cpp 65
python 50
The strings will have at most 10 alphabetic characters and the integers will range between 0 to 999.
In each line of output there should be two columns. The string should be in the first column and the integer in the second column. This is the output for the input above:
================================
java           100
cpp            065
python         050
================================
The first column should be left justified using exactly 15 characters. The integer of the second column should have exactly 3 digits. If the original input has less than 3 digits, you should pad with zeros to the left.

Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.

        To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

        Input Format

        Every line of input will contain a String followed by an integer.
        Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from to .

        Output Format

        In each line of output there should be two columns:
        The first column contains the String and is left justified using exactly  characters.
        The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

        Sample Input

        java 100
        cpp 65
        python 50
        Sample Output

        ================================
        java           100
        cpp            065
        python         050
        ================================
        Explanation

        Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th  character, and each integer that was less than 3 digits now has leading zeroes.
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            int s1=Integer.parseInt(sc.next());
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-14s %03d %n", s1,x);


        }
        System.out.println("================================");

    }
}
