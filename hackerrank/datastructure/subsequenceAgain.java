package hackerrank.datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by heena.madan on 02/09/17.
 */
public class subsequenceAgain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        String result = subsequenceAgain(s, k);
        System.out.println(result);
        in.close();
    }

    static String subsequenceAgain(String s, int k) {


        HashMap<Character,Integer> map =new HashMap<Character,Integer>();

        for(char c:s.toCharArray()){

            if(map.containsKey(c))

                map.put(c, map.get(c)+1);

            else{

                map.put(c, 1);

            }

        }

        List<Character> list = get(map,k);
        for(int i=0;i<list.size();i++){

             s= s.replace(list.get(i).toString(), "");

        }
        return s;



    }

    static List<Character> get(HashMap<Character,Integer> map, int k){

        List<Character> list = new ArrayList<>();


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue().compareTo(k) < 0) {
                list.add(entry.getKey());
            }
        }

return list;
    }

}
/*

    Sample Input 0

        hackerrank
        2
        Sample Output 0

        akrrak
        Explanation 0

        In 'akrrak', all the characters occur exactly 2 times.

        Sample Input 1

        baaabaacba
        3
        Sample Output 1

        baaabaaba*/
