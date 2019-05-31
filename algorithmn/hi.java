package algorithmn;


class Exc0 extends  Exception{}
class Exc1 extends  Exc0{}
public class hi {

    public static void main(String []args){
        try{
            throw new Exc1();
        }catch(Exc0 e){
            System.out.println("ex");
        }catch(Exception e){
            System.out.println("ecepx");
        }
    }
}
