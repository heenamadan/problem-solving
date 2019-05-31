package hackerrank.varargs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by heena.madan on 13/08/17.
 */
 class Add {

    public void add (int ... n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            System.out.print(n[i]);
            if (i<n.length-1) {
                System.out.print("+");
            }
        }
        System.out.println("=" + sum);
    }
}
public class Varargs {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());
            int n6=Integer.parseInt(br.readLine());
            Add ob=new Add();
            ob.add(n1,n2);
            ob.add(n1,n2,n3);
            ob.add(n1,n2,n3,n4,n5);
            ob.add(n1,n2,n3,n4,n5,n6);
            Method[] methods=Add.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;
            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


    public void add (int ... n) {
        int r = n[0];
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            System.out.print(n[i]);
            if (i<n.length-1) {
                System.out.print("+");
            }
        }
        System.out.println("=" + sum);
    }
}
