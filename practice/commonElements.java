package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by heena.madan on 03/09/17.
 */
public class commonElements {

    public static void main(String a[]){
        int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};

        //converting int array to Integer

        Integer[] arr=Arrays.stream(arr1).boxed().toArray(Integer[]::new);//refers to the default constructor of Integer
//In general A::B refers to method B in class A
        //union

        getUnion(arr1,arr2);
        getIntersection(arr1,arr2);




        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }


    public static   void getUnion( int[] arr1,  int[] arr2){
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        set1.addAll(set2);
        System.out.println(set1.size());
        System.out.printf("Union arr[] : %s",
                set1);
    }

    public static void getIntersection( int[] arr1,  int[] arr2){
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        set1.retainAll(set2);
        System.out.println(set1.size());
        System.out.printf("Intersection arr[] : %s",
                set1);
    }
}
