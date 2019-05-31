/**
 * Created by heena.madan on 31/10/16.
 */
/**
  * <b>IDeserve <br>
  * <a href="https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve</a>
  * Given a positive integer, find if it can be expressed by integers x and y as
  * x^y where y > 1 and x > 0.
  *
  * Example
  * Input : 625
  * Output : true as 5^4 = 625
  *
  * @author Saurabh
  */
public class Power {

    public static void main(String args[]) {
        System.out.println(isPower(625));


    }

    private static boolean isPower(int num) {
        if (num == 1) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            double div = Math.log(num) / Math.log(i);
            if ((div - (int) div) < 0.0000000001) {
                return true;
            }

        }

        return false;


    }
}


