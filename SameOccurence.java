import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SameOccurence {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            find(x,y,arr);
        }
        in.close();
    }

    static void find(int x,int y,int[] arr){

        List<String[]> list = subArray(arr.length,arr);
    }


    static List<String[]> subArray( int n, int[] arr)
    {
        List<String[]> listOfStringArray=  new ArrayList<>();
        String[] integers =new String[2^n];
        // Pick starting point
        for (int i=0; i <n; i++)
        { StringBuffer val=new StringBuffer("{");
            // Pick ending point
            for (int j=i; j<n; j++)

            {
                // Print subarray between current starting
                // and ending points
                for (int k=i; k<=j; k++) {
                    val.append(arr[k]+",");
                }
                integers[i] =val.toString();
                System.out.println();
            }
        }
        listOfStringArray.add(integers);
        return listOfStringArray;
    }


}
