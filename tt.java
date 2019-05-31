import java.io.IOException;

class tt{
    public static void main(String[] args){
        tt obj= new tt();
        int i=obj.chk();
        System.out.println(i);
    }
    int chk(){
        try{
            System.out.println("try");
            return 1;
        }catch(Exception e){
            System.out.println("catch");
            return 2;
        }/*finally{
            System.out.println("final");
            return 3;
        }*/
    }
}