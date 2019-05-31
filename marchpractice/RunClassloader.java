package marchpractice;

public class RunClassloader {

    public static void main(String args[]) throws Exception {

        CustomClassLoader customClassLoader= new CustomClassLoader(RunClassloader.class.getClassLoader());
        customClassLoader.loadClass(customClassLoader.getClass().getName());
    }
}
