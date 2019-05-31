import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class WordMatch {
    private static final String PRODUCT_TXT = "src/input.txt";
    private final  static Comparator lengthComparator = Comparator.comparing(String::length);
    private static int totalWords = 0;

    enum Direction{
        UP_LEFT(-1,-1,"DOWN_RIGHT"),UP(-1,0,"DOWN"),UP_RIGHT(-1,1,"DOWN_LEFT"),LEFT(0,-1,"RIGHT"),
        DOWN_LEFT(1,-1,"UP_RIGHT"),DOWN_RIGHT(1,1,"UP_LEFT"),DOWN(1,0,"UP"),RIGHT(0,1,"LEFT");

        private int rowMove,columnMove;
        private String oppositeValue;
        private Direction(int row, int column,String opposite) {
            this.rowMove = row;
            this.columnMove = column;
            this.oppositeValue = opposite;
        }

        Direction getOppositeDirection(){
            return Direction.valueOf(oppositeValue);
        }
    }

    void findOccurence(char[][] matrix, char[] word){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char c = matrix[i][j];
                if(word[0] == c){
                    matchFound(matrix,word,i,j,0,"",null);
                }
            }
        }
    }

    private void matchFound(char[][] matrix, char[] word,int row,int column,int counter,String path,Direction previousDirection) {
        boolean flag  = false;
        //if(!flag) {
        if (counter == word.length
                || matrix.length <= row
                || row < 0 || column < 0
                || matrix[row].length <= column
                || matrix[row][column] != word[counter]) {
            return;
        }

        path = path.concat(word[counter] + "[" + row + "," + column + "]");
        counter++;


        // outer:
        for (Direction direction : Direction.values()) {
            if (previousDirection == null || direction != previousDirection.getOppositeDirection()) {
                matchFound(matrix, word, row + direction.rowMove, column + direction.columnMove, counter, path, direction);
            }
        }
        if (counter == word.length) {
            System.out.println(path);
            flag = true;
            totalWords++;
            // break outer;


        }
        //}


    }


    public List<String> getKeywords(String fileName)  {
        int row=0, col=0, i, j;
        int arr[][] = new int[row][col];
        Scanner file=null;
        List<String> keywordList =new ArrayList<String>();
        String line = null;
        try {
            file = new Scanner(new File(fileName));

            while (file.hasNext()) {
                line = file.nextLine().trim();
                keywordList.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("File Not found..."+e.getMessage());
        } finally{
            file.close();
        }
        return keywordList;

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<String> keywordList;
        WordMatch obj = new WordMatch();
        keywordList = obj.getKeywords(PRODUCT_TXT);
        HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();
        Character character;
        String[] searchWords = keywordList.get(2).split(",");
        String arr[]=keywordList.get(0).split(",");
        int row=Integer.parseInt(arr[0]), col=Integer.parseInt(arr[1]), i, j;
        Character matrix[][] = new Character[row][col];
        char matrix1[][] = new char[row][col];
        keywordList = keywordList.subList(1,keywordList.size()-1);
        String characterString = keywordList.toString().replaceAll("\\[", "").replaceAll("\\]","").replaceAll(",","");
        int k=0;
        for ( i = 0; i < row; i++) {
            //array[i] = array[i].trim();
            for ( j = 0; j < col; j++) {
                //matrix1[i][j] = new Character(characterString.charAt(k++));
                matrix1[i][j] = characterString.charAt(k++);
                //characterString.r
            }
        }
        /*char mat1[][]= new char[][]{ {'G', 'D', 'X', 'I', 'P', 'L','K','I'},
                {'A', 'S', 'C', 'O', 'U', 'T','L','P'},
                {'N', 'A', 'S', 'A', 'M', 'A','Z','N'},
                {'E', 'A', 'H', 'L', 'N', 'M','L','R'},
                {'U', 'N', 'I', 'A', 'A', 'C','K','T'},
                {'B', 'S', 'M', 'N', 'Q', 'K','L','O'},
                {'F', 'Y', 'L', 'S', 'I', 'O','N','C'},
                {'T', 'P', 'A', 'D', 'J', 'T','V','U'},
                {'C', 'R', 'I', 'O', 'C', 'G','A','L'},
                {'K', 'E', 'O', 'W', 'T', 'N','E','L'},
                {'N', 'T', 'I', 'N', 'S', 'A','G','U'},
                {'Y', 'M', 'N', 'E', 'S', 'G','I','K'},
        };
        char word[] ="LANSDOWNE".toCharArray();*/


        //Arrays.stream(searchWords).forEach(s -> new MatrixWordMatch().findOccurenceCrazyly(matrix1, mat1));
        // new MatrixWordMatch().findOccurence(mat1, word);
        Arrays.sort(searchWords, lengthComparator);
        Arrays.stream(searchWords).forEach(s -> new WordMatch().findOccurence(matrix1, s.toCharArray()));
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime);
        System.out.println("words:"+totalWords);
        System.out.println("duration:"+duration);

    }

}