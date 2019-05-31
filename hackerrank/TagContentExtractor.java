package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by heena.madan on 31/07/17.
 */
public class TagContentExtractor {

    public static void main(String[] args){

        String regexPattern = "(<[^>]*>)";
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern stringPattern  = Pattern.compile(regexPattern);
        while(testCases>0){
            String line = in.nextLine();
            Matcher m = stringPattern.matcher(line);
            String previousHTMLTag = null;
            int previousTagPosition = -1;
            boolean find = false;
            while(m.find())
            {
                String htmlTag = line.substring(m.start(),m.end());
                if(htmlTag.charAt(1) != '/')
                {
                    previousHTMLTag = htmlTag;
                    previousTagPosition = m.end();
                }else if(htmlTag.charAt(1) == '/' && previousHTMLTag != null){
                    if(previousHTMLTag.substring(1).equals(htmlTag.substring(2))&&previousHTMLTag.length()>2 && m.start()>previousTagPosition+1){
                        System.out.println(line.substring(previousTagPosition,m.start()));
                        find = true;
                    }
                    previousHTMLTag = null;
                }

            }
            System.out.print(find?"":"None\n");
            testCases--;
        }

    }
}

/*
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
 */