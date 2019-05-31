package april19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SatckTest {

    public static void main(String args[]){
        java.util.Stack stack=new java.util.Stack();
    ArrayList<String> mylist = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
        Stack st =new Stack();
        for(int i = 0;i<n;i++) {
            mylist.add(sc.nextLine());
            func1(sc.next(), st);
            stackOperations(sc.next(), stack);
        }

        //func(mylist, st);
    }


    static void func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            Object element = it.next();
            //if(element)
        }

    }

    static void stackOperations(String em, java.util.Stack st) {

        if(em.startsWith("push")) {
            int x= Integer.parseInt(em.split(" ")[1]);
            st.push(x);
        } else if(em.startsWith("pop")) {
            int  y = (int)st.pop();
            System.out.println( y>0 ? y : "EMPTY");
        } else{
            int x= Integer.parseInt(em.split(" ")[1]);
            int y = Integer.parseInt(em.split(" ")[2]);
           int z=  (int)st.search(y);
           st.add(x, y+z);
        }

    }

    static void func1(String em, Stack st) {
        if(em.startsWith("push")) {
            int x= Integer.parseInt(em.split(" ")[1]);
            st.push(x);

        } else if(em.startsWith("pop")) {
            int  y = st.pop();
            System.out.println( y>0 ? y : "EMPTY");
        } else{
            int x= Integer.parseInt(em.split(" ")[1]);
            int y = Integer.parseInt(em.split(" ")[2]);
           // st.get

        }

    }
}
