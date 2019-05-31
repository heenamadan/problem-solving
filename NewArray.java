/*
import java.util.Scanner;

public class NewArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int Rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int Columns = input.nextInt();

        char[][] array = new char[Rows][Columns];

        for (int i = 0; i < Rows * Columns ; i++)
        {
            //input.n

            System.out.println("Enter the numbers in row " + (i+1) + ":");

            String rowContains = "Row " + (i+1) + " contains the following numbers: ";

            for (int j = 0; j < array[i].length; j++){
                array[i][j] = input.nextInt();
                rowContains += array[i][j] + ", ";
            }

            System.out.println(rowContains.substring(0, rowContains.length()-2) + "\n");

        }
    }
}*/
