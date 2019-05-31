package amazon;

public class Test {

    public static void main(String[] args) {
        Test.m(null);



    }


    private static void m(Object s){
        System.out.println("Object"+ s);
    }

    private static void m(String s){
        System.out.println("string"+ s);
    }

}

        /*String[] cities = {"bangalore","pune", "san","NY"};
        Mysort1 ms= new Mysort1();
        Arrays.sort(cities, ms);
        System.out.println(Arrays.binarySearch(cities,"NY"));

    }
      class Mysort1 implements Comparator{
        public  int compare(String a, String b){
            return  b.compareTo(a);
        }
    }

}
*/