package maypractice;

import java.util.HashSet;
import java.util.LinkedList;



public class DetectLoopInLL {

    static NewNode head;
    static class NewNode
    {
        int data;
        NewNode next;
        NewNode(int d) {data = d; next = null; }
    }

    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        NewNode new_node = new NewNode(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }




    public static void main(String[] args) {

        DetectLoopInLL llist = new DetectLoopInLL();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;//last wale m first ka address it means ho gya loop-connected first to last

        int isLoopExist = detectLoop(head);

        if (isLoopExist == 1)
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

    }





    static int detectLoop(NewNode head)
    {

        HashSet<NewNode> set = new HashSet<NewNode>();
        while(head!=null) {
            if(set.contains(head)) {
                return 1;
            }
            set.add(head);
            head=head.next;

        }
    return 0;
    }
}
