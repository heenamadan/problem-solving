package chegg;

import java.util.Scanner;

/**
 * This class is used to find the mean and standard deviation of the entered floating numbers by user.
 * Total numbers to be entered is given by command line argument line argument.
 *
 */
public class MeanAndStandardDeviation {
    public static void main(String [] args) {
        //command line argument
        Scanner scanner = new Scanner(System.in);
        //final int n = Integer.parseInt(args[0]);

        int n = Integer.parseInt(scanner.next());
        //creates array of n numbers.
        final float[] input = new float[n];
        //creates the scanner

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }
        //finding mean of the array
        float average = average(input);
        System.out.println("Mean: "+ average);
        //finding standard deviation
        float standardDeviation = standardDeviation(input, average);
        System.out.println("Standard Deviation: "+ standardDeviation);


    }

    /**
     * Calculate the mean of an array of values
     *
     * @param input the array of {@link Float}
     * @return the {@link Float}
     */
    public static float average(float[] input) {
        float sum = 0f;
        for (float number : input) {
            sum = sum + number;
        }
        return sum / input.length;
    }

    /**
     * Standard deviation is a statistical measure of spread or variability.The
     * standard deviation is the root mean square (RMS) deviation of the values
     * from their arithmetic mean.
     *
     * @param input the array of {@link Float}
     * @param mean the {@link Float}
     * @return the {@link Float}
     */
    public static float standardDeviation(float[] input, float mean) {
        float standardDeviation = 0.0f;
        for(float num: input) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return (float)Math.sqrt(standardDeviation/10);
    }
}


