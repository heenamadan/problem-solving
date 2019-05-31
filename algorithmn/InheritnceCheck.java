package algorithmn;



class A
{
    {
        System.out.println(1);
    }
}

class B extends A
{
    {
        System.out.println(2);
    }
}

class C extends B
{
    {
        System.out.println(3);
    }
}

public class InheritnceCheck
{
    public static void main(String[] args)
    {
        String s="str";
        int i=Integer.parseInt(s);
        C c = new C();
    }
}