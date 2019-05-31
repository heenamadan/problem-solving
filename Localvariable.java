/**
 * Created by heena.madan on 27/07/17.
 */
public class Localvariable {

    int x=3;
    public static void main(String args[]){

        new Localvariable().go1();
    }

    void go1(){

        int x =1;//local variable need to be initialized
        go2(++x);
        go2(x++);
    }
    void go2(int y){

        int x =++y;
        System.out.println(x);
    }
}
