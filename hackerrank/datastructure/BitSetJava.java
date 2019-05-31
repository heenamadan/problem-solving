package hackerrank.datastructure;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by heena.madan on 02/09/17.
 */
public class BitSetJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        while(M-- >0){
            String str = scan.next();
            int a = scan.nextInt();
            int b = scan.nextInt();
            switch (str){
                case "AND":
                    if (a == 1) {
                        B1.and(B2);
                    } else{
                        B2.and(B1);
                    }
                    break;
                case "OR":
                    if (a == 1) {
                        B1.or(B2);
                    } else{
                        B2.or(B1);
                    }
                    break;
                case "FLIP":
                    if (a == 1) {
                        B1.flip(b);
                    } else{
                        B2.flip(b);
                    }
                    break;
                case "SET":
                    if (a == 1) {
                        B1.set(b);
                    } else{
                        B2.set(b);
                    }
                    break;
                case "XOR":
                    if (a == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                default:
                    break;
            }
            System.out.println(B1.cardinality() + " "+B2.cardinality());
        }


    }
}
