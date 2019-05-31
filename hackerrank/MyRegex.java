package hackerrank;//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * Created by heena.madan on 30/07/17.
// */
//public class MyRegex {
//    private Pattern ptr;
//    private Matcher matcher;
//     final String pattern =
//            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
//                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
//
//
//    MyRegex(){
//        ptr = Pattern.compile(pattern);
//    }
//
//
//}

class MyRegex
{
    String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

}