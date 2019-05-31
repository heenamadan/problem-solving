import java.io.IOException;
import java.util.List;

class t{
    public static void main(String[] args){

        t obj= new t();
        int i=obj.chk();
        System.out.println(i);
    }
    public static <E> void append(List<E> list){
        //E e= new E();
       // list.add(e);

    }
    int chk(){
        try{
            throw new IOException();
            //System.out.println("try");
            //System.exit(0);
            //return 1;
        }catch(Exception e){
            System.out.println("catch");
            return 2;
        }finally{
            System.out.println("fi");
            return 3;
        }
    }
}