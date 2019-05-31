package feb19;

public class StaticTest {

    public static void main(String args[]) {
        System.out.println(fun());
    }

    static int fun() {
       // static int x = 10;  //Error: Static local variables are not allowed
        int x=10;
        return x--;
    }
}
