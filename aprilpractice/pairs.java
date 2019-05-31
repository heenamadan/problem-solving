package aprilpractice;

import java.util.ArrayList;
import java.util.List;

public class pairs {


    public static void main(String[] args) {

        int[] numbersWithDuplicates = {1,2,3,4,5,5,5,5,6,7,8,9,1,9};


        int[] arra= {1,2,3,4,5,5,6,4,7,11,12,13};

        int sum=11;

        String str= "IWIW371446";
        String ref = str.substring(4);
        System.out.println("--->"+ref);

        System.out.println(str.matches("(.*).(BC)"));

        //getPairsCount(numbersWithDuplicates, sum);
        long start = System.currentTimeMillis();
        long startTime = System.nanoTime();
        System.out.println(sumPairs(numbersWithDuplicates,sum));
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime/1000000);

    }


    public static int sumPairs(int[] input, int sum){
         List<Integer> total = new ArrayList<>(input.length);
        List<Integer> frequencies = new ArrayList<>(input.length);

        int pairs = 0;
        for(Integer number : input){
            if(frequencies.contains(number)){
                frequencies.remove(number);
                if (!isalreadyProcessed(number,total)) {
                    pairs++;
                }
                total.add(number);
            }
            else{
                frequencies.add(sum-number);

            }
        }
        System.out.println(total);
        return pairs;
    }

    private static boolean isalreadyProcessed(final int num, final List<Integer> total){
        return total.contains(num);
    }

}
