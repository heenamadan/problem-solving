package algorithmn;

public class t1 {
    public static void main(String[] args) {

        System.out.println(5%10);

        try{
            throw new RuntimeException();
        }catch(Throwable a){
            System.out.println("a");
        }finally{
            System.out.println("b");
        }
    }
}
