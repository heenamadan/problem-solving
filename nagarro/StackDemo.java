package nagarro;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args)
    {

        //System.out.println(2+3);
        //System.out.println(2+3);
        // Creating an empty Stack
        Stack<Integer> STACK = new Stack<Integer>();
        List<String> list = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] strArray =new String[n];
        for(int i = 1;i<=n;i++) {
           // list.add(sc.nextLine());
            System.out.println(sc.nextLine());
           // strArray[i] = sc.next();
        }
        /*list.add()
        13
        push 4
        pop
        push 3
        push 5
        push 2
        inc 3 1
        pop
        push 1
        inc 2 2
        push 4
        pop
                pop*/

       //stackOperations(Arrays.asList(strArray), STACK);



        // Displaying the Stack
        System.out.println("The stack is: " + STACK);

        // Checking for the element "4"
        System.out.println("Does the stack contains '4'? "
                + STACK.search("4"));
        // Checking for the element "Hello"
        System.out.println("Does the stack contains 'Hello'? "
                + STACK.search("Hello"));

        // Checking for the element "Geeks"
        System.out.println("Does the stack contains 'Geeks'? "
                + STACK.search("Geeks"));
    }

    static void stackOperations(List<String> list, Stack st) {
        for(String em: list) {
    if (em.startsWith("push")) {
        int push = Integer.parseInt(em.split(" ")[1]);
        st.push(push);
        System.out.println(push);
    } else if (em.startsWith("pop")) {
        int y = (int) st.pop();
        System.out.println(y > 0 ? y : "EMPTY");
    } else {
        int x = Integer.parseInt(em.split(" ")[1]);
        int y = Integer.parseInt(em.split(" ")[2]);
        int z = (int) st.search(y);
        st.add(x, y + z);
    }
}

    }
}
