package maypractice;

public class SwapNodesOnly {
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


    public void swapNodes(int x, int y) {//data given hoga. U need to swap nodes of that data

        if( x==y){// not required
            return;
        }
        Node currentX, prevX=null;
        currentX= head;
        while(currentX!=null && currentX.data!=x){
            prevX= currentX;
            currentX= currentX.next;

        }
        Node currentY, prevY=null;
        currentY= head;
        while(currentY!=null && currentY.data!=y){
            prevY= currentY;
            currentY= currentY.next;
        }

        if(currentX == null && currentY==null){
            return;
        }

        //swap now
        if(prevX!=null){
            prevX.next=currentY;
        }
        else{
            head= currentY;
        }
        if(prevY!=null){
            prevY.next= currentX;
        }
         else{
            head= currentX;
        }

        //swap address pointers
        Node temp= currentX.next;
        currentX.next= currentY.next;
        currentY.next= temp;

    }

    public void push(int new_data)
    {
        /* 1. alloc the Node and put the data */
        Node new_Node = new Node(new_data);

        /* 2. Make next of new Node as head */
        new_Node.next = head;

        /* 3. Move the head to point to new Node */
        head = new_Node;
    }

    /* This function prints contents of linked list starting
       from the given Node */
    public void printList()
    {
        Node tNode = head;
        while (tNode != null)
        {
            System.out.print(tNode.data+" ");
            tNode = tNode.next;
        }
    }
    public static void main(String[] args)
    {
        SwapNodesOnly llist = new SwapNodesOnly();

        /* The constructed linked list is:
            1->2->3->4->5->6->7 */
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("\n Linked list before calling swapNodes() ");
        llist.printList();

        llist.swapNodes(4, 3);

        System.out.print("\n Linked list after calling swapNodes() ");
        llist.printList();
    }

}
