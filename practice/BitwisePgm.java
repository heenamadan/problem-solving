package practice;

public class BitwisePgm {



public static void main(String args[])
        {
        /*int a = 1;
        int b = 2;
        int c = 3;
        a |= 4; // means +=
            System.out.println(a);// a= 4+1
        b >>= 1;
            System.out.println(b);// b= 10 in binary so sh ill remove 0 so its 1 in i is 1 in decimal
        c <<= 1;
            System.out.println(c);//c= 3 i.e 11 so add 0 for ls so its 110 and its 6
        a ^= c;
            System.out.println(a);
        System.out.println(a + " " + b + " " + c);*/
            System.out.println(25.64 % 10);
            System.out.println("------------------");
            int a = 1;
            int b = 2;
            int c;
            int d;
            c = ++b;
            System.out.println(b);
            d = a++;
            System.out.println("d->"+d);
            System.out.println("a->"+a);
            c++;
            System.out.println(c);
            b++;
            System.out.println(b);
            ++a;
            System.out.println(a);
            System.out.println(a + " " + b + " " + c);
        }
        }
