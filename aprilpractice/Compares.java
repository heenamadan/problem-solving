package aprilpractice;

import java.util.Arrays;
import java.util.Comparator;

public class Compares {

    public static void main(String[] args) {
String[] citie ={"bangalore","pune", "San Fransisco","New York city"};

        MySort my = new MySort();
        Arrays.sort(citie, my);
        System.out.println(Arrays.binarySearch(citie, "New York city"));

    }

    /*static class MySort implements Comparator{

        public int compare(String a, String b){// argumnet should be object

            return b.compareTo(a);

        }

    }*/
}
