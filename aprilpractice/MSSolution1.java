package aprilpractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MSSolution1 {


    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    /*
     * Complete the sort function below.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode sort(int k, SinglyLinkedListNode list) {
        /*
         * Write your code here.
         */
        System.out.println(list);

        MSSolution1.SinglyLinkedListNode current = list;
        MSSolution1.SinglyLinkedListNode next = null;
        MSSolution1.SinglyLinkedListNode prev = null;

        int count = 0;

       /* Reverse first k nodes of linked list */
        while (count < k && current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

       /* next is now a pointer to (k+1)th node
          Recursively call for the list starting from current.
          And make rest of the list as next of first node */
        if (next != null)
            list.next = sort(k, next);

        // prev is now head of input list
        return prev;
    }


    SinglyLinkedListNode sortedMerge(SinglyLinkedListNode a, SinglyLinkedListNode b)
    {
        SinglyLinkedListNode result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;

        /* Pick either a or b, and recur */
        if (a.data <= b.data)
        {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else
        {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;

    }

    SinglyLinkedListNode mergeSort(SinglyLinkedListNode h)
    {
        // Base case : if head is null
        if (h == null || h.next == null)
        {
            return h;
        }

        // get the middle of the list
        SinglyLinkedListNode middle = getMiddle(h);
        SinglyLinkedListNode nextofmiddle = middle.next;

        // set the next of middle node to null
        middle.next = null;

        // Apply mergeSort on left list
        SinglyLinkedListNode left = mergeSort(h);

        // Apply mergeSort on right list
        SinglyLinkedListNode right = mergeSort(nextofmiddle);

        // Merge the left and right lists
        SinglyLinkedListNode sortedlist = sortedMerge(left, right);
        return sortedlist;
    }

    SinglyLinkedListNode getMiddle(SinglyLinkedListNode h)
    {
        //Base case
        if (h == null)
            return h;
        SinglyLinkedListNode fastptr = h.next;
        SinglyLinkedListNode slowptr = h;

        // Move fastptr by two and slow ptr by one
        // Finally slowptr will point to middle node
        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(1);
        //list.insertNode(2);
        /*list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(6);
        list.insertNode(7);
        list.insertNode(8);*/
        //list.insertNode(1);

        /*list.insertNode(5);
        list.insertNode(8);
        list.insertNode(9);
        list.insertNode(3);*/




        /*int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");



        int listCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int listItr = 0; listItr < listCount; listItr++) {
            int listItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            list.insertNode(listItem);
        }*/
        int k=3;

        SinglyLinkedListNode res = sort(k, list.head);

        /*printSinglyLinkedList(res, "\n", bufferedWriter);
        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }



}
