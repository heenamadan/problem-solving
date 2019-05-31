package aprilpractice.accolite;

import java.util.Scanner;

public class ConsecutiveOne {


    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            int no = in.nextInt();
            String binary = Integer.toBinaryString(no);
            System.out.println(findConsecutiveOne(binary));
            testCases--;
        }
    }


    private static int findConsecutiveOne(String str){
        int maxConse =0;
        int conse =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                conse++;
                maxConse = Math.max(maxConse, conse);

            }
            else{
                conse = 0;
            }
        }
        return maxConse;

    }
}

/*
    Execution Time:0.09
    2
110
11101110

2
3

    */