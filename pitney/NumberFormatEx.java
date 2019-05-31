package pitney;

public class NumberFormatEx {

    public static void main(String [] args) {
        String [] args1 ={"x"};
        try{

            System.out.println(dos(args1));
        }
        catch(Exception e){
            System.out.println("catch");
        }
        dos(args1);
    }

    static int dos(String [] args){
        return Integer.parseInt(args[0]);
    }
}
