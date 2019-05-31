package marchpractice;

import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int no = Integer.parseInt(sc.nextLine().trim());
        String[] strArray = sc.nextLine().split(" ");
        for(int i=no-1; i>=0;i--){
            System.out.print(strArray[i]+ " ");

        }

    }
}
