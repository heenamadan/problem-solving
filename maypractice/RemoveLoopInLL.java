/*This method is also dependent on Floyd’s Cycle detection algorithm.
        1) Detect Loop using Floyd’s Cycle detection algo and get the pointer to a loop node.
        2) Count the number of nodes in loop. Let the count be k.
        3) Fix one pointer to the head and another to kth node from head.
        4) Move both pointers at the same pace, they will meet at loop starting node.
        5) Get pointer to the last node of loop and make next of it as NULL.
        */
package maypractice;

import java.util.HashSet;

public class RemoveLoopInLL {

    static NewNode1 head;
    static class NewNode1
    {
        int data;
        NewNode1 next;
        NewNode1(int d) {data = d; next = null; }
    }

    static public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        NewNode1 new_node = new NewNode1(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }




    public static void main(String[] args) {

        RemoveLoopInLL llist = new RemoveLoopInLL();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        llist.head.next.next.next.next = llist.head;//last wale m first ka address it means ho gya loop-connected first to last

        int isLoopExist = detectLoop(head);
        System.out.println(detectAndRemoveLoop1(head));//optimized 2 step is not required

        if (isLoopExist == 1)
            System.out.println("Loop found");
        else
            System.out.println("No Loop");

    }

    //optimized 2 step is not required- Without Counting Nodes in Loop)
    static int detectAndRemoveLoop1(NewNode1 node) {

        // If list is empty or has only one node
        // without loop
        if (node == null || node.next == null)
            return 0;

        NewNode1 slow = node, fast = node;

        // Move slow and fast 1 and 2 steps
        // ahead respectively.
        slow = slow.next;
        fast = fast.next.next;

        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;

            slow = slow.next;
            fast = fast.next.next;
        }

        /* If loop exists */
        if (slow == fast) {
            slow = node;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            /* since fast->next is the looping point */
            fast.next = null; /* remove loop */
            return 1;
        }
        return 0;
    }



    static int detectAndRemoveLoop(NewNode1 head) {
        NewNode1 slow=head;
        NewNode1 fast=head;

        while(slow!=null && fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;

            if(slow == fast){//loop found
                removeLoop(slow, head);

            }
        }

        return 0;

    }


//above algo
    static int removeLoop(NewNode1 slow, NewNode1 head){
        try {
            NewNode1 ptr1 = slow;
            NewNode1 ptr2 = slow;

            int count = 0;
            // Count the number of nodes in loop
            while (ptr1.next != ptr2) {
                ptr1 = ptr1.next;
                count++;
            }


            // Fix one pointer to head
            ptr1 = head;
            // And the other pointer to k nodes after head
            ptr2 = head;
            for (int i = 0; i < count; i++) {
                ptr2.next = ptr2;

            }
        /*  Move both pointers at the same pace,
         they will meet at loop starting node */
            while (ptr2 != ptr1) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;

            }

            //Get pointer to the last node
            ptr2 = ptr2.next;
            while (ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }

        /* Set the next node of the loop ending node
         to fix the loop */
            ptr2.next = null;
            return 1;
        }catch (Exception e) {
            return 0;
        }
    }



    static int detectLoop(NewNode1 head)
    {

        HashSet<NewNode1> set = new HashSet<NewNode1>();
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

    /*This method is also dependent on Floyd’s Cycle detection algorithm.
        1) Detect Loop using Floyd’s Cycle detection algo and get the pointer to a loop node.
        2) Count the number of nodes in loop. Let the count be k.
        3) Fix one pointer to the head and another to kth node from head.
        4) Move both pointers at the same pace, they will meet at loop starting node.
        5) Get pointer to the last node of loop and make next of it as NULL.
        */