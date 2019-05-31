package algorithmn;

public class TwoRepeatingByFormula {
    public static void twoElements(int [] A, int n){
        int a,b;
        int X =0;
        int Y =1;
        int S = n*(n+1)/2;
        int fact = factorial(n);
        for (int i = 0; i <A.length ; i++) {
            X += A[i];
            Y *= A[i];
        }
        int sum = X - S;
        int product = Y/fact;
        int subtract = (int)Math.sqrt(sum*sum - 4*product);

        a = (sum + subtract)/2;
        b = sum - a;

        System.out.println("Two Repeating Elements are: " + a + " and " + b);

    }
    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    public static void main(String[] args) {
        int [] A = {1,4,5,6,3,2,5,2};
        int n = 6;
        twoElements(A, n);
    }
}
