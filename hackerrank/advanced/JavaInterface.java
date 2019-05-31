package hackerrank.advanced;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by heena.madan on 28/08/17.
 */

interface AdvancedArithmetic{
    int divisor_sum(int n);

}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 1;
        if (n != 1) sum += n; // since we know divisible by 1 and itself (unless 1)
        for(int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n % i == 0) {
                sum += i;
                int d = n/i;
                if(d != i) sum+=d;
            }
        }
        return sum;
    }



}


public class JavaInterface {

    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}


