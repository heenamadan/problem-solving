package marchpractice;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

import static java.lang.Math.pow;

class GFG {

    // Returns true if n can be written as x^y


    static int isPower(int n)
    {
        for (int x = 2; x <= Math.sqrt(n); x++) {
            int y = 2;

            double p = Math.pow(x, y);

            while (p <= n && p > 0) {
                if (p == n)
                    return y;
                y++;
                p = Math.pow(x, y);
            }
        }
        return 1;
    }

    // Driver function
    public static void main(String[] args) {

        String str ="/content/iwc/europe/de/de/secure/contactus.html";
        String str1 = "/content/iwc/europe/eu/de/secure/contactus";
        System.out.println("------>>>>");




        String s= "/de/de/secure/shopping-bag.dfsf.init.html";
        String s1= "/de/de/secure/shopping-bag.html";
       //System.out.println(s.substring(s.indexOf('.') + 1, s.lastIndexOf(".")).trim());

        //String[] sh = StringUtils.split()
        System.out.println(s.substring(0, s.indexOf(".")));
        System.out.println("----" +s.substring(s.indexOf('.') + 1));
        System.out.println("----" +s1.substring(s1.indexOf('.') + 1));
        System.out.println("----last--" +s1.substring(s1.lastIndexOf('.')));

        System.out.println("-->  " +s.substring(s.indexOf(".")+1, s.lastIndexOf(".")));
        if (!(s1.lastIndexOf(".") == s1.indexOf("."))) {
            System.out.println("--sd>  " + s1.substring(s.indexOf(".") + 1, s1.lastIndexOf(".")));
        }

        if (!(s.lastIndexOf(".") == s.indexOf("."))) {
            System.out.println("--sdsdsd>  " + s.substring(s.indexOf(".") + 1, s.lastIndexOf(".")));
        }



        //s.substring(s.indexOf(".")+1).trim(), s.lastIndexOf('.') + 1).trim())
        System.out.println("---"+s.substring(s.lastIndexOf("/")+1, s.lastIndexOf(".")));
        System.out.println(s1.substring(s1.lastIndexOf("/")+1, s1.indexOf(".")));

        //System.out.println(s1.substring(s1.lastIndexOf("/")+1, s1.lastIndexOf(".")).trim());
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        System.out.println(isPower(n));

    }
}

