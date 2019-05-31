package hackerrank.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Created by heena.madan on 28/08/17.
 */

//convert byte to Hexadecimal


public class JavaMD5 {

    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s=cin.nextLine();
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] digest=md.digest();
            for(byte b:digest)System.out.printf("%02x",b);
        }catch(Exception e){}
    }
}

//    Sample Input 0
//
//        HelloWorld
//        Sample Output 0
//
//        68e109f0f40ca72a15e05cc22786f8e6
//        Sample Input 1
//
//        Javarmi123
//        Sample Output 1
//
//        2da2d1e0ce7b4951a858ed2d547ef485