public class dsf {
    static int a[]=new int[2];
    public static void main(String[] args){
        new dsf().d(null);
    }
    void d(Object o){
        System.out.println("o");
    }
    void d(String s){
        System.out.println("s");
    }
    static {
        a[2]=10;
        System.out.println(a[2]);
    }
}

