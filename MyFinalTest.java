public class MyFinalTest {

    public int doMethod(){
        try{
            throw new Exception();
            //System.out.println("in try");
            //return 5;
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
        /*int rVal = testEx.doMethod();
        System.out.println("The return Val : "+rVal);*/
        System.out.println(testEx.doMethod());
    }

}