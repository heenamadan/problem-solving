package aprilpractice;

public class ExceptionTest {

    public static void main(String [] args) {
        divide(4,0);

    }

    public static int divide(int a, int b){

        int c=-1;
        try{
            c =a/b;
        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("final");
        }
        return c;
    }
}
