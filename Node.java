/**
 * Created by heena.madan on 31/10/16.
 */
public class Node {



    private int pageNumber;
    private Node prev;
    private Node next;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Node getPrev() {
        return prev;
    }

    public Node(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
