package aprilpractice;

public class Test {


    public static void main(String[] args) {
        boolean a= false;
      /*  if( a=true){
            System.out.println("hello");

        }else{
            System.out.println("bye");
        }*/

        try{


            int x=0;
            for(x=1;x<4;x++)
                System.out.println(x);
        }catch (Exception e){}finally {
            System.out.println("Error");

        }
    }
}
