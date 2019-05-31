/**
 * Created by heena.madan on 26/07/17.
 */
public class MyFinalTest1 {
    public int doMethod(){
        try{
            throw new Exception();
        }
        catch(Exception ex){
            System.out.println("in catch");
            return 5;

        }
        finally{
            System.out.println("in finally");
            return 10;
        }
    }

    public static void main(String[] args) {

        MyFinalTest testEx = new MyFinalTest();
        int rVal = testEx.doMethod();
        System.out.println("The return Val : "+rVal);
    }
}
