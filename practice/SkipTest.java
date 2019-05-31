package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class SortA implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2){
        return o2.compareTo(o1);
    }
}

public class SkipTest {
    public static void main(String[] args) {

        /*Set set =  new TreeSet();
        set.add(1);
        set.add("2");
        set.add(3);*/
        Integer intar[]={2,3,1};
        Arrays.sort(intar, new SortA());
        for(int i: intar){
            System.out.println(i+ " ");
        }
       // Iterator iterator = set.iterator();
        /*while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
    }
