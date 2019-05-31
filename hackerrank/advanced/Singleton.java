package hackerrank.advanced;

/**
 * Created by heena.madan on 14/08/17.
 */
public class Singleton {

    private Singleton(){}
    public String str = "";
    private static Singleton singletonInstance = null;

    public static Singleton getSingleInstance(){
        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
