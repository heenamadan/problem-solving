package aprilpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DistinctPairs1 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int[] numbersWithDuplicates = {1,2,3,4,5,5,5,5,6,7,8,9,1,9};


        int noOfUniqueElements = numbersWithDuplicates.length;

        //Comparing each element with all other elements

        for (int i = 0; i < noOfUniqueElements; i++)
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal

                if(numbersWithDuplicates[i] == numbersWithDuplicates[j])
                {
                    //Replace duplicate element with last unique element

                    numbersWithDuplicates[j] = numbersWithDuplicates[noOfUniqueElements-1];

                    //Decrementing noOfUniqueElements

                    noOfUniqueElements--;

                    //Decrementing j

                    j--;
                }
            }
        }

        int[] arrayWithoutDuplicates = Arrays.copyOf(numbersWithDuplicates, noOfUniqueElements);


        //prettyPrint(numbers, 7);
       // System.out.println(countOfDistinctPairs(numbersWithDuplicates,10));
        System.out.println(getPairsCount(arrayWithoutDuplicates,10));
     //   prettyPrint(numbersWithDuplicates, 10);
        long start = System.currentTimeMillis();
        List list = Arrays.asList(arrayWithoutDuplicates);
        Set set= new HashSet(list);
        int[] newarr=new int[set.size()];

        long end = System.currentTimeMillis();
        System.out.println(printPairs(numbersWithDuplicates, 11));
    }


    public static int printPairs(int[] array, int sum) {
        int[] arr = {1,2,3,4,5,5,5,5,6,7,8,9,1,9};
        int count=0;
        Set<String> set= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];
                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                    count++;

                  // System.out.printf("(%d, %d) %n", first, second);
                    //set.add(String.valueOf(first) + "," + String.valueOf(second));
                }
            }


            //set.s
        }

        set.stream().forEach(s -> System.out.println(s));
        return set.size();
    }

    private Set<String> check(Set set){


        return set;
    }

    static int getPairsCount(int[] arr, int sum)
    {
        int n= arr.length;
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i=0; i<n; i++){

            // initializing value to 0, if key not found
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);

            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i=0; i<n; i++)
        {
            if(hm.get(sum-arr[i]) != null)
                twice_count += hm.get(sum-arr[i]);

            // if (arr[i], arr[i]) pair satisfies the condition,
            // then we need to ensure that the count is
            // decreased by one such that the (arr[i], arr[i])
            // pair is not considered
            if (sum-arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count/2;
    }



    public static int countOfDistinctPairs(int[] input, int k){
        int numOfPairs = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : input){
            map.put(i, map.containsKey(i) ? 2 : 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int i = e.getKey();

            //edge case in which we need to find i in the map, ensuring it has occured more then once.
            if(k == 0)
                numOfPairs = numOfPairs + map.get(i) == 2 ? 1 : 0;

            else if(map.containsKey(i+k))
                numOfPairs++;
        }
        return numOfPairs;
    }



    public static void prettyPrint(int[] givenArray, int givenSum) {
        System.out.println("Given array : " + Arrays.toString(givenArray));
        System.out.println("Given sum : " + givenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
        printPairs(givenArray, givenSum);
    }
}

