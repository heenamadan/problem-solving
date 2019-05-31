package may19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws FileNotFoundException, IOException{

        String str = "AAAABBBCCD";

        try (FileReader reader = new FileReader("/Users/heena.madan/Documents/projects/Practice/Test/src/may19/filename.txt");



             BufferedReader br = new BufferedReader(reader)) {

            // read line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                writeToFile(line);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }


    private static void writeToFile(String line) throws IOException{
        try (FileWriter writer = new FileWriter("output.txt", true);
             BufferedWriter bw = new BufferedWriter(writer)) {
            line = line.replaceAll("[AaEeIiOoUu]", "*");
            bw.write(line);

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

}
