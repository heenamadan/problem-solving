/**
 * Created by heena.madan on 31/10/16.
 */
public class DoublyLinkedList {

    private  Node head;

    public DoublyLinkedList(int size) {
        this.size = size;
        currentSize=0;
    }

    private Node tail;
    private int size;
    private int currentSize;

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void moveAhead(Node pageNode){

        if(pageNode == null || pageNode == head) {
            return;
        }

        if(pageNode == tail){
            tail=tail.getPrev();
            tail.setNext(null);
        }

       Node previous = pageNode.getPrev();
        Node next = pageNode.getNext();
        previous.setNext(next);
        if(next!=null){

            next.setPrev(previous);
        }
        pageNode.setPrev(null);
        pageNode.setNext(head);
        head.setPrev(pageNode);
        head= pageNode;



    }

    public Node addPageToStartOfList(int pageNo){
        Node node = new Node(pageNo);
        if(head == null){

            head= node;
            tail=node;
            currentSize=1;
            return node;

        }
        else if(currentSize<size){

            currentSize++;
        }
        else {
            tail=tail.getPrev();
            tail.setNext(null);

        }


        node.setNext(head);
        head.setPrev(node);
        head= node;
        return node;


    }

    public void  printList(){

        if(head==null){
            return;
        }
        else{

            Node tmpNode = head;
            if(tmpNode!=null) {
                System.out.println(tmpNode.getPageNumber());
                tmpNode.getNext();
            }
        }
    }

}
