package amazon;

public class GC {

    private Demo d;
    void start(){
        d= new Demo();
    }

    void take(Demo d){
        d= null;
        d= new Demo();
    }

   class Demo{}

    public void finalize(){System.out.println("object is garbage collected");}
}
