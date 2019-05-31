package april19;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Customer> set = new HashSet<Customer>();
        set.add(new Customer(1,"Raj"));
        set.add(new Customer(1,"Raj"));
        set.add(new Customer(1,"Raj"));
        set.add(new Customer(1,"Raj"));
        System.out.println("Size :"+set.size());
    }
}
