package AmazonBhask;

public class SmalletNum {

    public static int smallestElement(int[] A) {
        int smallestNum = Integer.MAX_VALUE;
        if(A == null || A.length == 0) {
            return 0;
        }
        for(int i : A) {
            if(i < smallestNum) {
                smallestNum = i;
            }
        }
        return smallestNum;
    }

    public static void main (String[] args){
        int a[]={9,2,5,6,3,2};
        System.out.println(smallestElement(a));
    }
}
