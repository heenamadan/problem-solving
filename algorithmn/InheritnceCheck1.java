package algorithmn;


class A1
{
    String s = "Class A";
}

class B1 extends A1
{
    String s = "Class B";

    {
        System.out.println(super.s);
    }
}

class C1 extends B1
{
    String s = "Class C";

    {
        System.out.println(super.s);
    }
}

public class InheritnceCheck1
{
    public static void main(String[] args)
    {
        C1 c = new C1();

        //System.out.println(c.s);
    }
}