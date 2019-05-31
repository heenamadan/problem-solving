package april19;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

    public static void main(String[] args) {

        int a[]={1,2,5,6,3,2};
        Integer b[]={1,2,5,6,3,2};

        System.out.println("Second Largest with sort mthd: "+getSecondLargest(a,6));
        System.out.println("Second Largest with out inbuild func: "+getSecondLargestWithOutInBuiltMtd(a,6));
        System.out.println("Second Largest using collections: "+getSecondLargestUsingCollections(b,6));
        getSecondLargest1(b,6);
    }

    static int getSecondLargest(int a[], int n){
        Arrays.sort(a);
        return a[n-2];


    }

    static int getSecondLargestWithOutInBuiltMtd(int a[], int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if(a[i] >a[j]){
                    int temp = a[i];
                    a[i] =a[j];
                    a[j]= temp;
                }
            }
        }
        return a[n-2];


    }

    static int getSecondLargestUsingCollections(Integer a[], int n){
        List<Integer> list =Arrays.asList(a);
        Collections.sort(list);
        return list.get(n-2);


    }

    static void getSecondLargest1(Integer a[], int n){
        int first,second;
        first=second=Integer.MIN_VALUE;
        if(n<2){
            System.out.println("no asnwer");
            return ;
        }

        for(int i=0;i<n;i++){
            //
            if(a[i]>first){
                second=first;
                first=a[i];
            }
            else if(a[i]>second && a[i]!=first) {
                second=a[i];
            }



        }
        if(second == Integer.MIN_VALUE) {
            System.out.println("no answer");
        }
        else{
            System.out.println("Second Largest using min value"+second);
        }





    }
}
