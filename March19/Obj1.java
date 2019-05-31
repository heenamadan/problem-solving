package March19;

public class Obj1 {

    private Obj1(int data){
        System.out.printf("constr called");
    }

    protected static Obj1 create(int data){
        Obj1 obj= new Obj1(data);
        return obj;


    }

    public void mthd(){
        System.out.printf("in mthd");
    }
}
