package AmazonBhask;

public class RemoveCharFromString {

    public static void main(String[] args){

        String str="google";
        System.out.println(removeChar(str, 'g').toString());
    }

    private static StringBuilder removeChar(String s, char c){

        StringBuilder stringBuilder= new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch!=c) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder;
    }
}
