package aprilpractice;

import java.util.Comparator;
import java.util.Objects;

public class MySort implements Comparator

    {

        public int compare(Object a, Object b){
            String a1= (String)a;
            String b1= (String)b;

        return ((String) a).compareTo(b1);

    }
}
