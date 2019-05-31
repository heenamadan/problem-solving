package hackerrank.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by heena.madan on 01/08/17.
 */
public class PhoneBook {

    public static void main(String []argh)
    {
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phoneNumber=in.nextInt();
            phoneBook.put(name,phoneNumber);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(phoneBook.containsKey(s)){
                System.out.println(s+ "=" + phoneBook.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
