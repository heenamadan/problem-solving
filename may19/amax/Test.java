package may19.amax;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test {
    static int t;
    Test(){}


    public static void main(String[] args){
        String a = "heena";
        String b= new String("heena");
        String c =a;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b.equals(c));
        System.out.println(t);

        Date date = new Date();
        System.out.println(date.toString());

        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'"); // Quoted "Z" to indicate UTC, no timezone offset
        df.setTimeZone(tz);
        String nowAsISO = df.format(new Date());
        System.out.println(nowAsISO);
    }
}
