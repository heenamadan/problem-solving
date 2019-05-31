package algorithmn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class TwoRepeatingHashMap {
    public static void twoElements(int [] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <A.length ; i++) {
            if(map.containsKey(A[i])){
                int count = map.get(A[i]);
                map.put(A[i],++count);
            }else
                map.put(A[i],1);

        }
        System.out.print("Repeated Elements are : ");
        Set set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            int key = iterator.next();
            if(map.get(key)==2){
                System.out.print(key + " ");
            }
        }
    }
    public static void main(String[] args) {
        int [] A = {1,5,2,4,8,9,3,1,4,0};
        twoElements(A);
    }
}
