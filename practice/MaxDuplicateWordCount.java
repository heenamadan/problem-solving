package practice;

/**
 * Created by heena.madan on 03/09/17.
 */
//Write a program to find maximum repeated words from a file
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class MaxDuplicateWordCount {

    public static void main(String a[]){
        MaxDuplicateWordCount mdc = new MaxDuplicateWordCount();
        Map<String, Integer> wordMap = mdc.getWordCount("src/practice/test.txt");
        Map<String, Integer> map= mdc.sort(wordMap);

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
        //mdc.getSecondHeighestWord(map,1 );
       System.out.println(mdc.getSecondHeighestWord(map, 1));
       /* List<Entry<String, Integer>> list = mdc.sortByValue(wordMap);
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }*/
    }

    public String getSecondHeighestWord(Map<String, Integer> map, int index){
        return  map.keySet().toArray()[index].toString();


    }



    public Map<String, Integer> getWordCount(String fileName){

        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        try {
            fis = new FileInputStream(fileName);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, " ");
                while(st.hasMoreTokens()){
                    String tmp = st.nextToken().toLowerCase();
                    if(wordMap.containsKey(tmp)){
                        wordMap.put(tmp, wordMap.get(tmp)+1);
                    } else {
                        wordMap.put(tmp, 1);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{if(br != null) br.close();}catch(Exception ex){}
        }
        return wordMap;
    }

    public List<Entry<String, Integer>> sortByValue(Map<String, Integer> wordMap){

       /* Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
*/

        Set<Entry<String, Integer>> set = wordMap.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        return list;
    }

    public Map<String, Integer> sort(Map<String, Integer> wordMap){
        Map<String, Integer> result = new LinkedHashMap<>();
        /*return wordMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));*/
        wordMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));
        return result;



    }
}