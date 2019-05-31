package hackerrank.advanced;

import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by heena.madan on 28/08/17.
 */
public class JavaSHA256 {

    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s=cin.nextLine();
        printDivisors(6);
        try{
            MessageDigest md=MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes());
            byte[] digest=md.digest();
            for(byte b:digest)System.out.printf("%02x",b);
        }catch(Exception e){}
    }

    static public Set<Integer> div(int n){
        Set<Integer> set = new HashSet<>();
        //if (n != 1) sum += n;
        for (int i=1; i<=Math.sqrt(n)+1; i++){
            if(n%i ==0){
                if (n/i == i){
                    set.add(i);
                }
            }
        }
        return set;

    }

    static void printDivisors(int n)
    {
        // Note that this loop runs till square root
        for (int i=1; i<=Math.sqrt(n)+1; i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i)
                    System.out.printf("%d ", i);


            }
        }
    }
}

