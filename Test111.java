import java.util.Arrays;

public class Test111 {

    public static void main(String args[])
    {
        System.out.println(func("Wed", 2));
        System.out.println(java.time.Clock.systemUTC().instant());


    }

    static String func(String S, int k){

    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    int dayIndex = find(days, S);
    if(dayIndex == -1 || k == -1){
        System.out.println("no answer");
    }
    int laterDays = k%7;
    int laterDayIndex = (dayIndex + laterDays) % 7;
    return days[laterDayIndex];


}

    public static int findIndex(String arr[], String t)
    {

        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }



    public static int find (String[] array , String name) {
        return Arrays.asList(array).indexOf(name);
    }
}

