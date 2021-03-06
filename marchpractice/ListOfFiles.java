package marchpractice;

import java.io.File;
import java.util.ArrayList;

public class ListOfFiles {


    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<File>();

        listf("/Users/heena.madan/Documents/personal" , files);
        System.out.println(files.size());


    }


    public static void listf(String directoryName, ArrayList<File> files) {
        File directory = new File(directoryName);

        // get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                listf(file.getAbsolutePath(), files);
            }
        }
    }
}
