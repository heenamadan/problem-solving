/**
 * Created by heena.madan on 25/07/17.
 */
public class ReverseSinglyLL<T> {

    private NodeStructure<T> head;
    public static void main(String a[]){
    ReverseSinglyLL<Integer> sl = new ReverseSinglyLL<Integer>();
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

        NodeStructure<T> nd = new NodeStructure<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        NodeStructure<T> tmp = head;
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
        NodeStructure<T> newNode = new NodeStructure<T>();
        newNode.setValue(e);
        //starting m head Null
        NodeStructure<T> start = head;
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
        NodeStructure<T> tmp = head;
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
        NodeStructure<T> prev = null;
        NodeStructure<T> current = head;
        NodeStructure<T> next = null;
        while(current != null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }
}

class NodeStructure<T> implements Comparable<T> {

    private T value;
    private NodeStructure<T> nextRef;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public NodeStructure<T> getNextRef() {
        return nextRef;
    }
    public void setNextRef(NodeStructure<T> ref) {
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

