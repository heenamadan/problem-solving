package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListTest {

    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            list.add("c");
        }*/
        /*Vector<String > vector = new Vector<>();
        vector.add("1");
        vector.add("2");
        Enumeration<String> e = Collections.enumeration(vector);
        while (e.hasMoreElements()){
            vector.add("3");
            System.out.println(e.nextElement());
        }*/

        /*Set set = new HashSet();
        set.add("1");
        set.add(1);
        set.add(null);
        set.add("null");
        System.out.println(set);*/
Set<Integer> treeset = new TreeSet<Integer>(new Comparator<Integer>() {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
});

treeset.add(3);
        treeset.add(1);
        treeset.add(2);
        System.out.println(treeset);



    }
    }
