package may19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats> ... visits) {

        Map<Long, Long> visitCounterMap = new HashMap<>();

        Map<String, UserStats>[] map = visits;

        List<Map<String, UserStats>> list = Arrays.asList(map);



        Iterator<Map<String, UserStats>> iterator =
                list.iterator();


        while(iterator.hasNext()) {

            Map<String, UserStats> userStatsMap = iterator.next();

            Set<Entry<String, UserStats>> entrySet = userStatsMap.entrySet();

            for(Entry<String, UserStats> entry : entrySet) {

                if (Objects.nonNull(entry.getKey())) {
                    long id = Long.valueOf(entry.getKey());

                if (Objects.nonNull(entry.getValue())) {
                    UserStats userStats = entry.getValue();
                    Optional<Long> val = userStats.getVisitCount();
                    val.ifPresent(value -> {
                        if(visitCounterMap.containsKey(id)) {
                            visitCounterMap.put(id, val.get() +1);
                        } else {
                            visitCounterMap.put(id, val.get());
                        }
                    });
                }
            }


            }

        }



        return null;
    }

    public static void main(String args[]){
        Map<String, UserStats> map =new HashMap<>();
        UserStats st=new UserStats();
        //st.setVisitCount(1);

    }
}
