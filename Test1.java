import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by heena.madan on 17/06/17.
 */
public class Test1 {
    public static void main(String args[]) {

        warehouseScalability(null, null);

    }

    public static String[] warehouseScalability(String[] input1, String[] input2) {

        String[] output = new String[4];
        Map<String, String> map = new HashMap<>();
        map.put("W1", "S1");
        // map.put("W2", "S2");
        // map.put("W3", "S3");
        map.put("W4", "S1");
        List<String> listOfCodes = new ArrayList<>();
        List<String> listOfskills = new ArrayList<>();
        /*for(String arr : input1){
            map.put(arr.split("#")[0], arr.split("#")[1]);
            listOfCodes.add(arr.split("#")[0]);
            listOfskills.add(arr.split("#")[1]);
            match(listOfCodes, listOfskills,output,map);
        }*/
        // String[] input = { "S1#40#10#101","S1#20#10#106", "S2#10#5#102", "S2#30#20#108","S2#20#5#105", "S1#50#5#110","S1#90#15#107", "S3#90#15#103", "S3#40#5#109" ,"S3#91#20#104" };
        String[] input = { "S1#40#10#101","S1#20#10#106", "S1#50#5#110","S1#90#15#107" , "S1#90#5#111", "S1#90#12#112"}; //
        //String[] input = { "S1#40#10#101","S1#20#10#106", "S1#50#5#110","S1#90#15#107" }; //
        match(listOfCodes, listOfskills, output, map, input);
        return null;
    }

    static void match(List<String> listOfCodes, List<String> listSkills, String[] output, Map<String, String> map, String[] input2) {

        /*for(int i=0;i<listOfCodes.size();i++){
            String c= listOfCodes.get(i);
            String s= listSkills.get(i);
            if(Collections.frequency(listSkills, s) > 1) {
                listSkills.in

            }
        }*/

        Map<String, ArrayList<String>> reverseMap = new HashMap<>(
                map.entrySet().stream()
                        .collect(Collectors.groupingBy(Map.Entry::getValue)).values().stream()
                        .collect(Collectors.toMap(
                                item -> item.get(0).getValue(),
                                item -> new ArrayList<>(
                                        item.stream()
                                                .map(Map.Entry::getKey)
                                                .collect(Collectors.toList())
                                ))
                        ));
        System.out.println(reverseMap);
        List<String> list = Arrays.asList(input2);
        for(String key : reverseMap.keySet()){
            List<String> sameSkills = new ArrayList<>();


            for (int i = 0; i < list.size(); i++)

            {

                if (list.get(i).startsWith(key)) {
                    sameSkills.add(list.get(i));
                }
            }
            getJobs(sameSkills,key, reverseMap.get(key));
            System.out.println(sameSkills);
        }

    }

    static void getJobs(List<String> sameSkills, String skill, ArrayList<String> desigList){
        //check high designation priority- if W1 and W2 are there then W1 will be prioritized.
        System.out.println(desigList.size());
        String[] arr = null;
       /*for(String str: sameSkills){
            arr= str.split("#");
        }

        for(String str: arr){
            System.out.println("splitted-----------"+str);
        }*/
        if(desigList.size() == 1){
            // List priorityList= getHighPriorityList(sameSkills);
//            List jobs = getJobsOnPriority(priorityList,sameSkills);

            //  System.out.println("josb----"+jobs);
            //print in format.

        } else{
            HashMap<String,Integer> map=getHighPriorityMap(sameSkills);
            allocate(desigList,map);

        }


    }

    static void allocate(ArrayList<String> desigList,HashMap<String,Integer> map ) {
        Map<Integer ,Integer> map1= new HashMap<>();
        Map<Integer ,String> map3= new HashMap<>();
        Map<String ,Integer> map2= new HashMap<>();
        StringBuffer[] stringBuffers = new StringBuffer[4];
        int[] balanceTime = new int[desigList.size()];
        List<Integer> balaceList =  new ArrayList<>();
        Iterator<Map.Entry<String ,Integer>> it = map.entrySet().iterator();
        //check map values have duplicates? if not then cal this for loop else write

        //when two or more have same priority.
       HashMap<String,Integer> hashmap = getDuplicateValues(map);
        map.keySet().removeAll(hashmap.keySet());
        System.out.println(map);
        Set<String> keySet = hashmap.keySet();
        for(String key: keySet){
            map3.put(Integer.parseInt(key.split("#")[3]), key.split("#")[2]);
        }
        //sort map on basis of values then u get sorted ordered(on working hours)
        System.out.println(map3);
        Map<Integer, String> treeMap = new TreeMap<>(
                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
        );
       //treeMap.putAll(map3);
        int val = map3.size();
        List<Integer> keys= new ArrayList<Integer>(map3.keySet());
        for(int i=0;i<val;i++){
            String str = desigList.get(i) ;
            Integer k = keys.get(i);
            String k1 = "#" + k.toString();

            StringBuffer s = stringBuffers[i]  ;
            if(Objects.nonNull(s)) {
                stringBuffers[i] = s.append(k1.toString());
            }else{
                StringBuffer sb = new StringBuffer(str + k1);
                stringBuffers[i] = sb;
            }
            keys.remove(i);

            if(i  == desigList.size() -1 && keys.size() >0){
                i = -1;

            }
            else if(keys.size() == 0){
                break;
            }

        }
       // treeMap.
        for (Map.Entry<String ,Integer> e : hashmap.entrySet()) {
            map2.put(e.getKey(),e.getValue());

        }
        //map.putAll(map1);




        //do when priority is different for all
        Set<String> set = map.keySet();
        List<String> list = new ArrayList<String>(set);
        for(int i=0;i<desigList.size();i++) {
            StringBuffer sb = new StringBuffer((Objects.nonNull(stringBuffers[i])?stringBuffers[i] :desigList.get(i)) + "#" + list.get(0).split("#")[3]);
            balanceTime[i] = Integer.parseInt(list.get(0).split("#")[2]);
            balaceList.add(Integer.parseInt(list.get(0).split("#")[2]));
            stringBuffers[i] =sb;
            list.remove(list.get(0));
        }
        System.out.println(balanceTime);
       // Arrays.sort(balanceTime);
        System.out.println(balanceTime);

        for(String e : list) {
            System.out.println("balaceList--->"+balaceList.size());

            if(balaceList.size()>1) {
                String str = checkNextJobId(e, balanceTime, stringBuffers, balaceList);
                int location = Integer.parseInt(str.split("#")[4]);
                stringBuffers[location].append("#" + str.split("#")[3]);
            } else{
                String str = checkNextJobId(e, balanceTime, stringBuffers, balaceList);
                stringBuffers[0].append("#" + str.split("#")[3]);
            }
        }




for(StringBuffer sb : stringBuffers){
    System.out.println("-->"+sb);

}

        System.out.println("lenghth" +stringBuffers.length);

    }

    /*static String checkNextJobId(List<String> list, int[] balanceTime,StringBuffer[] stringBuffers){
        for(int i=0;i<list.size();i++){
            int timeTaken = Integer.parseInt(list.get(0).split("#")[2]);
            if (balanceTime[i] + timeTaken >balanceTime[i]){
                return null;
            }
            return list.get(0);

        }

    }*/

    static HashMap<String,Integer> getDuplicateValues(HashMap<String,Integer> in)
    {
        // Clone input HashMap because we're removing stuff from it
        in = (HashMap)in.clone();
        HashMap rval = new HashMap();
        Object[] keys = in.keySet().toArray();

        // iterate through all keys
        for(int x=0;x<keys.length;x++) {
            Object value = in.get(keys[x]);
            in.remove(keys[x]);
            // if value is in input HashMap, store it in duplicate HashMap because it has another value
            if(in.containsValue(value)) {
                rval.put(keys[x],value);
            }
            // if value is in duplicate HashMap, store it also because it HAD another value earlier
            if(rval.containsValue(value)) {
                rval.put(keys[x],value);
            }
        }

        return(rval);
    }

    static String checkNextJobId(String list, int[] balanceTime,StringBuffer[] stringBuffers, List<Integer> balaceList) {
        int loc=soryArray(balanceTime, balaceList);
        if(loc != -1) {

            //for (int i = 0; i < list.size(); i++) {
                int timeTaken = Integer.parseInt(list.split("#")[2]);
            int secondLoc=getAnotherLocation(loc);
                if (balaceList.get(loc) + timeTaken <= balaceList.get(secondLoc)) {
                    balaceList.remove(loc);
                    return list +"#"+ loc;
                }


            //}
        }
        return list;
    }


    static int getAnotherLocation(int currentLoc){
       return currentLoc == 1? currentLoc-1 : currentLoc+1;

    }
    static int soryArray(int[] balanceTime, List<Integer> balaceList){
        int i=0;
        if(balaceList.size()>1 && balaceList.get(i)>balaceList.get(i+1)){
            return i+1;
        }
        return -1;

    }

    static void setDesignationPriority(ArrayList<String> desigList,List<String> sameSkills){
        Map<Integer,String> map = getHighPriorityList(sameSkills);
        Map<String ,String> map1= new HashMap<>();
        String[] multi = new String[desigList.size()];
        List<String> jobs = getJobsOnPriority(map.keySet(), sameSkills);
        System.out.println("jobs--"+jobs);
        for(int i=0;i<desigList.size();i++){
            String desigCode = desigList.get(i);
            // multi[i] = desigCode + "#" + jobs.get(0);
            map1.put(desigCode,map.get(i));

            System.out.println("heena---->"+multi[i]);
            jobs.remove(jobs.get(0));

        }
        System.out.println("new jobs--->"+jobs);



    }
    static void getPriority(ArrayList<String> desigList){


    }

    static List<String> getJobsOnPriority(Set<Integer> priorityList, List<String> sameSkills) {
        List job = new ArrayList();
        List<String> job1 = new ArrayList();
        for ( Object val: priorityList) {

//logic change

            job = sameSkills.stream().filter(s -> s.split("#")[1].equalsIgnoreCase(val.toString()))
                    .map(s -> s.split("#")[3])
                    .collect(Collectors.toList());
            System.out.println("---"+job);
            job1.add(job.toString());
        }
       /* List job= sameSkills.stream().filter(str->str.split("#")[1].equalsIgnoreCase(priorityList.stream().filter(d->d)))
                .map(str->str.split("#")[3]).collect(Collectors.toList());
*/
        return job1;
    }

    static List getHighPriorityList1(List<String> sameSkills){
        Map<Integer,String> map = new HashMap<>();
        for(String skills : sameSkills){
            map.put(Integer.parseInt(skills.split("#")[1]), skills);
        }
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });
        treeMap.putAll(map);
        /*Map<Integer, String> treeMap = new TreeMap<>(
                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
        );*/

        System.out.println("map-->"+treeMap);
        //sort map on basis of key


        List priorityList= sameSkills.stream()
                .map(str->str.split("#")[1])
                .collect(Collectors.toList());

        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(priorityList, comparator);
        System.out.println("ppp>"+priorityList);
        return priorityList;

    }

    static Map<Integer,String>  getHighPriorityList(List<String> sameSkills){
        Map<Integer,String> map = new HashMap<>();
        for(String skills : sameSkills){
            map.put(Integer.parseInt(skills.split("#")[1]), skills);
        }
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });
        treeMap.putAll(map);
        /*Map<Integer, String> treeMap = new TreeMap<>(
                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
        );*/

        System.out.println("map-->"+treeMap);

        return treeMap;

    }


    static void setDesignationPriorityNew(ArrayList<String> desigList,List<String> sameSkills){
        Map<Integer,String> map = getHighPriorityList(sameSkills);


    }

    static HashMap<String,Integer>  getHighPriorityMap(List<String> sameSkills){
        Map<Integer,String> map1 = new HashMap<>();
        Integer[] priority = new Integer[sameSkills.size()];
        String skillArr [] = new String[sameSkills.size()];
        List priorityList= sameSkills.stream()
                .map(str->str.split("#")[1])
                .collect(Collectors.toList());
        for(int i=0;i<sameSkills.size();i++){
            priority[i] = Integer.parseInt(sameSkills.get(i).split("#")[1]);
            skillArr[i] = sameSkills.get(i);
            //list add
        }
        // Arrays.sort(priority, Collections.reverseOrder());

        Map<Integer,String> map = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        List<String > list = new ArrayList<>();
        for(int i=0;i<priority.length;i++){
            map.put(i,priority[i]+"-"+skillArr[i]);


        }
        for(String skills : sameSkills){
            map2.put(skills, Integer.parseInt(skills.split("#")[1]));
        }

        /*for(String skills : sameSkills){
            if(map2.containsValue(skills.split("#")[1])) {
                map2.put(skills, Integer.parseInt(skills.split("#")[1]));
            }else {
                map.put(Integer.parseInt(skills.split("#")[1]), skills);
            }
        }*/
        /*Map<String, Integer> treeMap = new TreeMap<String, Integer>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }

                });
        treeMap.putAll(map);*/

        HashMap<String, Integer> result = map2.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(result);




        /*Map<Integer, String> treeMap = new TreeMap<>(
                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
        );*/

        map.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });


        for(String skills : sameSkills){
            //map.forEach(k,v);

        }

        //System.out.println("map-->"+treeMap);

        return result;

    }

}
