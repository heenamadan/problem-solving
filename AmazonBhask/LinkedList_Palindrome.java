package AmazonBhask;


class NodeL
{
    String data;
    NodeL next;

    NodeL(String d)
    {
        data = d;
        next = null;
    }
}

public class LinkedList_Palindrome {

    NodeL head;

    public static void main(String[] args)
    {
        LinkedList_Palindrome list = new LinkedList_Palindrome();
        list.head = new NodeL("a");
        list.head.next = new NodeL("bc");
        list.head.next.next = new NodeL("d");
        list.head.next.next.next = new NodeL("dcb");
        list.head.next.next.next.next = new NodeL("a");

        System.out.println(list.isPalindrome());

    }


    boolean isPalindrome() {
        NodeL node = head;
        String str = "";
        while (node != null) {
            str = str.concat(node.data);
            node = node.next;
        }
        int len= str.length();
        for (int i = 0; i < len / 2; i++) {
            if(str.charAt(i) != str.charAt(len -1 -i))
            return false;
        }
        return true;
    }


}
