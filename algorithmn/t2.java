package algorithmn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t2 {
    public  static Integer i1;

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A","B","D"));

        for(String i: list){
            if("D".equals(i)){
                list.add("E");
            }
        }
        System.out.println(list);
        //int i2;
        //i2=i1;
        //System.out.println(i1+"_"+i2);

        int a=1;
        double b=0.2d;
        float c=3.2f;
        long d=1L;
        long e= a+d;
        double f= c+b;
        //float h= e*f;
    }

    public final void hello1(){}
    public void hello1(int a){}
}
