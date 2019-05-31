package algorithmn;

public class TwoRepeatingElementsByIndex {
    //this solution will work only if all the numbers are in the range of 1 to n and are >0
    //navigate the array if number is x then multiply the A[x] by -1.
    //If A[x] is already negative, then it means we are visiting it second time, means it is repeated.
    public static void twoRepeating(int [] A){
        System.out.print("Repeated Elements are: ");
        for (int i = 0; i <A.length ; i++) {
            System.out.println(" i ="+ i);
            System.out.println("value-"+ A[Math.abs(A[i])]);
            if(A[Math.abs(A[i])]<0) {
                System.out.println("in if");
                System.out.print(Math.abs(A[i]) + " ");
            }
            else {
                System.out.println("in else");
                A[Math.abs(A[i])] = A[Math.abs(A[i])] * -1;
            }
        }
    }
    public static void main(String[] args) {
        int [] A = {1,4,5,6,3,2,5,2};
        int n = 6;
        twoRepeating(A);
    }
}
