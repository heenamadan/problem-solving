package april19;


import java.util.ArrayList;
import java.util.List;

class A{
    public void dis(){
        System.out.println("in a");
    }
}

class B extends  A{
    public void dis(){
        System.out.println("in b");
    }
}
public class CheckPoly {

    public static void main(String args[]) {
      //  B b =(B) new Object();
        //b.dis();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Double average = list.stream().mapToInt(i->i).average().orElse(0.0);
        //list.stream().mapToDouble(BigDecimal::)
        System.out.println(average);
    }
}
