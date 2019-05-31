package hackerrank;

import java.util.Scanner;

/**
 * Created by heena.madan on 30/07/17.
 */
public class JavaStaticInitializerBlock {



    static int breadth, height;
    static int result;
    static boolean flag;
    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();
        if (breadth <= 0 || height <= 0)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
            flag = true;
            result = breadth*height;
    }

    public static void main(String[] args) {
        if(flag) {
            System.out.println(breadth*height);
        }


    }
    }
    //1 and 3
//1 and -1
