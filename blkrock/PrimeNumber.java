package blkrock;

public class PrimeNumber {

    public static void main(String args[]) {
        printPrime(1,10);

    }

    static void printPrime(int start,int end){

        outer : for(int i=start;i<=end;i++) {

        int last = (int)Math.sqrt(end);
        for(int j=2;j<=last;j++) {
            if(i!=j && i%j==0){
                continue outer;

            }

        }
            System.out.println(i);

        }
    }

}
