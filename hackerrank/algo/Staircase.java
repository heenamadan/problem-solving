package hackerrank.algo;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num  = Integer.parseInt(sc.nextLine());
        for(int i=0;i<num;i++){
            for(int j=1;j<=num;j++){
                System.out.print(j<num-i?" ":"#");
            }
            System.out.println("");
        }

    }
}
