/**
 * Created by heena.madan on 25/07/17.
 */
public class Question3 {

    public static void main(String[] args){

        if(null == null){
            System.out.println("heena");
        }
        int a = Integer.parseInt("1011011", 2);
        System.out.println(a);
        short s=0;
        int x=07;
        System.out.println("y"+x);
        int y = 8;
        System.out.println("y"+y);
        int z= 123456;
        s+=z;
        System.out.println(s);
        System.out.println("" +x+y+s);
    }

   // 0 to 7 decimal no are defined. i.e 00 to 07 .On 08 onwards its octal value thats why error on
    //int x = 08 ->Integer number too large.
}
