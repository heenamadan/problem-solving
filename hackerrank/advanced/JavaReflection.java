package hackerrank.advanced;



import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by heena.madan on 14/08/17.
 */
public class JavaReflection {


    public static void main(String[] args){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());

        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}
