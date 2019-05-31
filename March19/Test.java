package March19;

public class Test {

    public static void main(String args[]) {
        Obj1 obj= Obj1.create(20);
       // obj.mthd();
        int i=0;
        addTwo(i++);
        System.out.println(i);

        int scores[]={1,2,33};
       // int sc[][]={1,2,3},{2,3,4};
        boolean b[]= new boolean[]{true,false,true};
        String cat[]={"sf","DF"};
        Integer ads[]={new Integer(3),new Integer(3),new Integer(3)};
    }

    static void addTwo(int i){
        i+=2;

    }

}
