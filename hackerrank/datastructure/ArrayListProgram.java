package hackerrank.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by heena.madan on 31/07/17.
 */
public class ArrayListProgram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.next());

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int n=0;n<N;n++){
            int noOfElements = Integer.parseInt(sc.next());
            list.add(new ArrayList<Integer>());
            for(int d=0;d<noOfElements;d++){
                list.get(n).add(Integer.parseInt(sc.next()));
            }
        }

        int Q=sc.nextInt();
        for(int q=0;q<Q;q++){
            int x = Integer.parseInt(sc.next());
            int y = Integer.parseInt(sc.next());
            if(x>list.size() || y>list.get(x-1).size()){
                System.out.println("ERROR");
            }
            else System.out.println(list.get(x-1).get(y-1));

            }
        }

    }

    /*


    Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!
     */
