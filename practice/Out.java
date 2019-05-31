package practice;

public class Out {
    public static void main(String args[])
    {
        double a, b,c;
        a = 3.0/0;
        b = 0/4.0;
        c=0/0.0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        bar();
    }
    public static int foo(int a, String s)
    {
        s = "Yellow";
        System.out.println("s in foo->"+s);
        a=a+2;
        return a;
    }
    public static void bar()
    {
        int a=3;
        String s = "Blue";
        a = foo(a,s);
        System.out.println("a="+a+" s="+s);
    }
}
