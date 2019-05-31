package practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

class Output {
    public static void addNumbers(List list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
    /*public static void main(String args[]) {
        List ld = Arrays.asList();
        ld.add(10.4);
        //addnumbers(ld);
        System.out.println("getList(2)");
    }*/

    public static void main(String args[]) {
         int a = 10, b = 20;
        /*while (a < b) {

            System.out.println("Hello");
        }*/
        System.out.println("World");// put final befire int a=10;

        System.out.println("ser question-------");
        TreeSet map = new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator itr = map.iterator();
        while
                (itr.hasNext()){
            System.out.println(itr.next());//ascending order
        }


    }
}