package maypractice;

import java.util.LinkedList;

public class SegregateEvenOddNodesLL {
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void segregateEvenOdd() {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;
        while(currentNode!=null){
            int data = currentNode.data;
            if(data %2 == 0){//even

                if(evenStart ==null){//list empty
                    evenStart = currentNode;
                    evenEnd = evenStart;

                } else{
                    evenEnd.next = currentNode;
                    evenEnd= evenEnd.next;

                }


            } else{//odd
                if(oddStart==null){
                    oddStart=currentNode;
                    oddEnd=oddStart;
                }
                else{
                    oddEnd.next=currentNode;
                    oddEnd=oddEnd.next;
                }

            }

            currentNode= currentNode.next;


        }

        if(oddStart == null || evenStart == null) {
            return;
        }

       evenEnd.next = oddStart;
        oddEnd.next=null;
        head = evenStart;

    }

    void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        SegregateEvenOddNodesLL llist = new SegregateEvenOddNodesLL();
        LinkedList linkedList= new LinkedList();
        linkedList.push("2");
        llist.push(11);
        llist.push(10);
        llist.push(9);
        llist.push(6);
        llist.push(4);
        llist.push(1);
        llist.push(0);
        System.out.println("Origional Linked List");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Modified Linked List");
        llist.printList();
    }
}
