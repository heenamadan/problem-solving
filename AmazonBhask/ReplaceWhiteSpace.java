package AmazonBhask;

public class ReplaceWhiteSpace {

    public static void main(String[] args) {
        String str="my name is      Heena";
        StringBuffer stringBuffer = new StringBuffer();
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                stringBuffer.append(strArray[i]);
            }
        }

        System.out.println(stringBuffer.toString());
        System.out.println(str.replaceAll("\\s", ""));
    }
    }
