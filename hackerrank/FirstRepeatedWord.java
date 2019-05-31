package hackerrank;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.HashSet;

/**
 * Created by heena.madan on 27/08/17.
 */
public class FirstRepeatedWord {

    public static void main (String[] args)
    {
        String str = "Ravi had been saying that he had been there";
        System.out.println(findFirstRepeated(str));
    }


     static String findFirstRepeated(String str){
         String array[] = str.split("\\s+");
         HashSet<String> set = new HashSet<>();


         for(int i=0 ; i<array.length;i++){
             String word=array[i];
             if(set.contains(word)){
                 return word;

             }else{
                 set.add(word);
             }


         }
        return null;

    }
}
