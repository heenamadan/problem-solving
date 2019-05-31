
public class SinglyLinkedListImpl<T> {

    private Node1<T> head;

    public static void main(String a[]){
        SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
        System.out.println();
        sl.traverse();
        System.out.println();
        long startTime = System.currentTimeMillis();
        sl.reverse();
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("time-->"+duration);
        sl.traverse();
    }

    public void add(T element){

        Node1<T> nd = new Node1<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        Node1<T> tmp = head;
        while(true){
            if(tmp == null){
//since there is only one element, both head and
//tail points to the same object.
                head = nd;
                break;
            } else if(tmp.getNextRef() == null){
                tmp.setNextRef(nd);
                break;
            } else {
                tmp = tmp.getNextRef();
            }
        }
    }

    public void add1(T e){
        Node1<T> newNode = new Node1<T>();
        newNode.setValue(e);
        //starting m head Null
        Node1<T> start = head;
        while (true) {
            if (start == null) {
                head = newNode;
                break;

            }
            else if(start.getNextRef() ==null){
                start.setNextRef(newNode);
            }else{
                start = start.getNextRef();//ptr=add[ptr]
            }
        }

    }

    public void traverse(){
        Node1<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.print(tmp.getValue()+"\t");
            tmp = tmp.getNextRef();
        }
    }

    public void reverse(){
        System.out.println("\nreversing the linked list\n");
        Node1<T> prev = null;
        Node1<T> current = head;
        Node1<T> next = null;
        while(current != null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
}

class Node1<T> implements Comparable<T> {

    private T value;
    private Node1<T> nextRef;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node1<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(Node1<T> ref) {
        this.nextRef = ref;
    }
    @Override
    public int compareTo(T arg) {
        if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}