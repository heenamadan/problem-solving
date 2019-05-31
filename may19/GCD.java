package may19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());

        for(int j=1;j<=testCases;j++) {

                String lines = br.readLine();
                String[] strs = lines.trim().split("\\s+");
                int[] arr1 = new int[strs.length];
                for (int i = 0; i < strs.length; i++) {
                    arr1[i] = Integer.parseInt(strs[i]);
                }
                System.out.println("Case " + j + ": " + findGCD(arr1));


        }




    }

    static int GCD(int num1,int num2){

        while (num1 != num2) {
            if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num2;

    }

    static  int findGCD(int[] arr){
        int res = arr[0];
        int n= arr.length;
        if(n >1) {
            for (int i = 1; i < n; i++) {
                res = GCD(arr[i], res);

            }
            return res;
        } return 1;

    }
}
