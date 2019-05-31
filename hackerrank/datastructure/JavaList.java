package hackerrank.datastructure;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by heena.madan on 31/08/17.
 */
public class JavaList {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int value = scan.nextInt();
            list.add(value);
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
