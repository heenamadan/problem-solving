import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class huu {
    public static void main(String[] args) {
        List l= new ArrayList();
        huu t = new huu();
        huu t1 = new huu();
        l.add(t);
        l.add(t1);
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

    }
}
