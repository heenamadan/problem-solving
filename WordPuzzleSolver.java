/*
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static jdk.nashorn.internal.objects.Global.print;

public class WordPuzzleSolver {
    private static  char[][] puzzle;
    public static String word;

    public static void readFile(File inFile) {
        try{
            FileReader read = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(read);
            String[] dimensions = reader.readLine().split(" ");

            puzzle = new char[Integer.parseInt(dimensions[0])][Integer.parseInt(dimensions[1])];

            for(int i = 0; i < puzzle[0].length; i++){
                String val = reader.readLine();
                puzzle[i] = val.toCharArray();
            }
            word = reader.readLine();
            while(word != null){
                solvePuzzle();
                word = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void solvePuzzle() {
        char firstLetter = word.charAt(0);

        for(int i = 0; i < puzzle.length; i++){
            for(int j = 0; j < puzzle[i].length; j++){

                if(puzzle[i][j] == firstLetter){

                    if(checkUp(i, j, word)){
                        print(word, i, j, "U");

                        //System.out.println("the word found:"+word);
                    }
                }
            }
        }
    }

    private static boolean checkUp(int i, int j, String word){

        int index = j;
        for(char letter : word.toCharArray()){

            if(index >= puzzle[i].length){
                return false;
            }

            if(puzzle[i][index] != letter){
                return false;
            }

            index++;
        }
        return true;
    }*/
