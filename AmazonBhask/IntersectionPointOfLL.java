package AmazonBhask;

import java.util.Hashtable;

public class IntersectionPointOfLL {


    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        IntersectionPointOfLL intersectionPointOfLL= new IntersectionPointOfLL();

        intersectionPointOfLL.head1 = new Node(3);
        intersectionPointOfLL.head1.next = new Node(6);
        intersectionPointOfLL.head1.next.next = new Node(9);
        intersectionPointOfLL.head1.next.next.next = new Node(15);
        intersectionPointOfLL.head1.next.next.next.next = new Node(30);



        // creating second linked list
        intersectionPointOfLL.head2 = new Node(10);
        intersectionPointOfLL.head2.next = new Node(15);
        intersectionPointOfLL.head2.next.next = new Node(30);

        Hashtable<Node, Integer> hashtable = new Hashtable();

        /*while (head1.next!=null){
            hashtable.put(head1.next, 1);
        }

        while(head2.next!=null){
            if(hashtable.contains(head2.next)){
                System.out.println("found"+ head2.data);
            }
        }*/


        System.out.println("The node of intersection is " + intersectionPointOfLL.getNode());



    }

    private static int getNode(){

        int count1 = getCount(head1);
        int count2 = getCount(head2);
        int d;
        if(count1>count2){
            d = count1-count2;
            return getIntersectionNode(d, head1, head2);
        } else{
            d = count2 - count1;
            return getIntersectionNode(d, head2, head1);
        }


    }

    private static int getCount(Node current){
        int count=0;
            while(current.next!=null){
                count++;
                current=current.next;
            }
        return count;
    }

    private static int getIntersectionNode(int dis, Node h1, Node h2){
        Node current1= head1;
        Node current2= head2;
        for(int i=0;i<dis;i++){

            if(current1==null){
                return -1;
            }
            current1=current1.next;
        }

        while(current1!=null &&current2!=null ){
            if(current1.data==current2.data){
                return current2.data;

            }
            current1=current1.next;
            current2=current2.next;
        }

return -1;

    }
}
