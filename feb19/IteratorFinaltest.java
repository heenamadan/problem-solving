package feb19;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorFinaltest {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Rams");
        names.add("Posa");
        names.add("Chinni");

        // Getting Iterator
        Iterator<String> namesIterator = names.iterator();

        // Traversing elements
        while (namesIterator.hasNext()) {
            final String bn=namesIterator.next();
            System.out.println(bn);
        }

    }
}
