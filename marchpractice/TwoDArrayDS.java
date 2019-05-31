package marchpractice;

import java.util.Scanner;

public class TwoDArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }

        sum(arr);
    }

    private static void sum(int[][] intArr){
        int min_sum = Integer.MIN_VALUE;

        for(int i=0 ;i<4;i++){
            for(int x=0 ;x<4;x++){

                int top = intArr[i][x]+intArr[i][x+1]+intArr[i][x+2];
                int middle = intArr[i+1][x+1];
                int bottom = intArr[i+2][x]+intArr[i+2][x+1]+intArr[i+2][x+2];
                if(top+middle+bottom>min_sum){
                    min_sum=top+middle+bottom;
                }
            }
        }
        System.out.println(min_sum);
    }

}

/*
1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 2 4 4 0
        0 0 0 2 0 0
        0 0 1 2 4 0
        19

*/
