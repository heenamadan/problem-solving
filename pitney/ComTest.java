package pitney;

import java.util.Arrays;

public class ComTest {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        Comparator com = new Comparator();
        System.out.println(com.compare(arr1, arr2));
        System.out.println(com.compare(2, 2));
        System.out.println(com.compare("heena", "sd"));
    }

}

class Comparator{

    boolean compare(final int a, final int b){
        return a==b;

    }

    boolean compare(final String a, final String b){
        return a.equals(b);

    }



    boolean compare(final int[] a, final int[] b){
        return a.length == b.length && compareElementAtIndex(a,b);

    }
    boolean compareElementAtIndex(int[] a, int[] b) {
        return Arrays.equals(a, b);

    }
}
