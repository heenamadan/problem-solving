package practice;

public class Lattice {

    public static void main(String[] args) {
        int r=5;
        System.out.println(countLattice(r));

    }

    static int countLattice(int radius){
        if (radius <= 0)
            return 0;
        // Initialize result as 4 for (r, 0), (-r. 0),
        // (0, r) and (0, -r)
        int result = 4;

        for(int i=1;i<radius;i++)
        {
            int square = radius*radius - i*i;
            int sqrt = (int)Math.sqrt((double)square);
            System.out.println("point"+ " ("+i+","+result+" )");
            if(square == sqrt*sqrt){

                result +=4;
            }
        }
        return result;

    }
}
