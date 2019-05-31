package AmazonBhask;

public class RevereString {

    public static String reverseSentence(String str) {
        if(str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sB = new StringBuilder();
        String[] strings = str.split(" ");
        for(int i = strings.length -1; i >= 0; i--) {
            if(!strings[i].equals("")) {
                sB.append(strings[i]).append(" ");
            }
        }
        if(sB.length() == 0) {
            return "";
        }
        sB.setLength(sB.length() - 1);
        return sB.toString();
    }

    public static void main (String[] args){
        System.out.println(reverseSentence("my name is heena"));

    }
}
