package practice;


/*class a {
    a() {
        System.out.println("const a");
        new a();
    }
}

    class Test {
        public static void main(String[] args) {
            a aa = new a();
        }
    }*/

/*class Test {
    public static void main(String args[])
    {
        int g = 3;
        System.out.print(++g * 8);
    }
}*/

/*class Test {
    public static void main(String args[])
    {
        char array_variable [] = new char[10];
        for (int i = 0; i < 10; ++i) {
            array_variable[i] = 'i';
            System.out.print(array_variable[i] + "" );
            i++;
        }
    }
}*/

/*class Test {
    public static void main(String args[])
    {
        int x;
        x = 10;
        x = x >> 1;
        System.out.println(x);
    }
}*/

/*import java.util.*;
class Test {
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
    public static void main(String args[]) {
        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println(sumOfList(ld));
    }
}*/

import java.util.Hashtable;

class Test {
    /*public static void main(String args[]) {
        Hashtable obj = new Hashtable();
        obj.put("A", new Integer(3));
        obj.put("B", new Integer(2));
        obj.put("C", new Integer(8));
        obj.clear();
        System.out.print(obj.size());
    }*/

    /*public static void main(String args[])
    {
        double var1 = 1 + 5;
        double var2 = var1 / 4;
        int var3 = 1 + 5;
        int var4 = var3 / 4;
        System.out.print(var2 + " " + var4);

    }*/

    /*public static void main(String args[])
    {
        boolean a = true;
        boolean b = !true;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = d ? b : c;
        System.out.println(d + " " + e);
    }*/

    /*public static void main(String args[])
    {
        int a = 1;
        int b = 2;
        int c = 3;
        a |= 4;
        b >>= 1;
        c <<= 1;
        a ^= c;
        System.out.println(a + " " + b + " " + c);
    }*/
    /*public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40, 50};
        for(int i=0; i < arr.length; i++)
        {
            System.out.print(" " + arr[i]);
        }

        int x, y, z;
        x = 0;
        y = 1;
        x = y = z = 8;
        System.out.println(x);
    }*//*public static void main(String args[])
    {
        int sum = 0;
        int x=0;
        //System.out.println(x++);
       // x = x + 1;
       // x+=1;
       // x+=1;
        x++;
        System.out.println(x);

    }*/

    /*public static void main(String args[])
    {
        int x = 3;
        int y = ~ x;
        int z;
        z = x > y ? x : y;
        System.out.print(z);
    }*/
    /*public static void main(String args[])
    {
        int x = 8;
        System.out.println(++x * 3 + " " + x);
        boolean a = true;
        boolean b = false;
        boolean c = a ^ b;
        System.out.println(!c);
    }*/
    /*public static void main(String args[])
    {
        int sum = 0;
        for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
            sum += i;
        System.out.println(sum);
    }*/
    /*public static void main(String args[])
    {
        double a = 25.64;
        int  b = 25;
        a = a % 10;
        b = b % 10;
        System.out.println(a + " "  + b);
    }*/
   /* public static void main(String args[])
    {
        char a = 'A';
        a++;
        System.out.print((int)a);
    }*/

    /*public static void main(String args[])
    {
        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);

}*/
    /*public static void main(String args[])
    {
        int x , y;
        x = 10;
        x++;
        --x;
        y = x++;
        System.out.println(x + " " + y);
    }*/
    public static void main(String args[])
    {
        int g = 3;
        System.out.print(++g * 8);
    }
}