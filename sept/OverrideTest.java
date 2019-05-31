package sept;

class Addition
{
    // adding two integer value.
    public int add(int a, int b)
    {

        Integer sum = a+b;
        return sum;
    }
}

class Addition1 extends Addition{
    // adding three integer value.
    /*public double add(int a, int b)
    {
        double sum = a+b+0.0;
        return sum;
    }*/

}

public class OverrideTest {

    public static void main (String[] args)
    {
        Addition ob = new Addition1();

        int sum1 = ob.add(1,2);
        System.out.println("sum of the two integer value :" + sum1);

        int sum2 = ob.add(1,2);
        System.out.println("sum of the three integer value :" + sum2);

    }
}
