package amazon;

public class StringObjects {

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s);
        String s1 = "hello";
        System.out.println(s1);
        if (s1==s){
            System.out.println("s and s1");

        }

        s="java";
        if (s1==s){
            System.out.println("s and s1");

        }
        System.out.println(s);
        String s2= new String("heena");
        System.out.println(s2);
        s2 = "hello";
        System.out.println(s2);
        String s3 ="java";
        if (s2==s3){
            System.out.println("s2 and s3");

        }
        System.out.println(s3);






    }

}
