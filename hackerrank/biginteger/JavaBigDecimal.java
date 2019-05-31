package hackerrank.biginteger;

import javafx.util.Pair;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by heena.madan on 13/08/17.
 */
public class JavaBigDecimal {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int T=cin.nextInt();
        ArrayList<javafx.util.Pair<BigDecimal,String> > a=new ArrayList<Pair<BigDecimal,String> >();
        for(int i=0;i<T;i++){
            String s=cin.next();
            a.add(new javafx.util.Pair<BigDecimal,String>(new BigDecimal(s),s));
        }
        Collections.sort(a,(x, y)->-x.getKey().compareTo(y.getKey()));
        for(int i=0;i<T;i++)System.out.println(a.get(i).getValue());
    }
}
