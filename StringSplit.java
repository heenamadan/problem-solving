/**
 * Created by heena.madan on 31/08/17.
 */
public class StringSplit {

    public static void main(String []args){

        String str = "/content/dam/rcq/iwc/10/26/14/8/1026148.png";
        System.out.println(str.substring(str.lastIndexOf("/")+1, str.lastIndexOf(".")));
    }
}
