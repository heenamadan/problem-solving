package AmazonBhask;

//Below solution divides the problem into subproblems of size y/2 and call the subproblems recursively.
public class Power {

    static int power(int x, int y)
    {
        if (y == 0)
            return 1;
        int temp = power(x, y/2);
         if (y % 2 == 0)
            return temp * temp;
        else
            return x * temp * temp;
    }

    /* Program to test function power */
    public static void main(String[] args)
    {
        int x = 2;
        int y = 10;

        System.out.printf("%d", power(x, y));
    }
}