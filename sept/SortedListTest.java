package sept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class SortedList {

    private ArrayList<Integer> list;

    /**  Constructor  **/
    public SortedList()
    {
        list = new ArrayList<Integer>();
    }
    /**  Function to check if list is empty  **/
    public boolean isEmpty()
    {
        return list.size() == 0 || list == null;
    }
    /** Function to clear list  **/
    public void clear()
    {
        list = new ArrayList<Integer>();
    }
    /**  Function to get size of list  **/
    public int size()
    {
        return list.size();
    }
    /**  Function to add element to list  **/
    public void add(int ele)
    {
        int pos = list.size();
        list.add(ele);
        while (pos > 0 && ele < list.get(pos - 1))
        {
            list.set(pos, list.get(pos - 1));
            pos--;
        }
        list.set(pos, ele);
    }
    /** Function to remove element at index **/
    public void remove(int ind)
    {
        list.remove(ind);
    }
    /** Function to perform binary search  **/
    public int binarySearch(int ele)
    {
        return Collections.binarySearch(list, ele);
    }
    /**  Function to check if element is present in list  **/
    public boolean contains(int ele)
    {
        return binarySearch(ele) >= 0;
    }
    /** Function to string  **/
    public String toString()
    {
        return list.toString();
    }
}

/**  Class SortedList  **/
public class SortedListTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class SortedList */
        SortedList list = new SortedList();

        System.out.println("Sorted List Test\n");
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSorted List Operations\n");
            System.out.println("1. insert");
            System.out.println("2. remove ");
            System.out.println("3. binary search");
            System.out.println("4. contains");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            System.out.println("7. clear");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to add");
                    list.add( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter index");
                    list.remove(scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Binary search result : "+ list.binarySearch(scan.nextInt() ));
                    break;
                case 4 :
                    System.out.println("Enter integer element ");
                    System.out.println("Contains result : "+ list.contains(scan.nextInt() ));
                    break;
                case 5 :
                    System.out.println("Empty status = "+ list.isEmpty());
                    break;
                case 6 :
                    System.out.println("Size = "+ list.size() +" \n");
                    break;
                case 7 :
                    System.out.println("Sorted List cleared");
                    list.clear();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            System.out.println(list);

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
