package may19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherGroupHtml {

    public static void main(String[] args) {

        String stringToSearch = "<p>Yada yada yada <code>StringBuffer</code> yada yada ...</p>";

        // the pattern we want to search for
        Pattern p = Pattern.compile("<code>(\\S+)</code>");
        Matcher m = p.matcher(stringToSearch);

        // if we find a match, get the group
        if (m.find()) {

            // get the matching group
            String codeGroup = m.group(1);

            // print the group
            System.out.format("'%s'\n", codeGroup);

        }

    }
}
