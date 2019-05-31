package hackerrank.datastructure;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by heena.madan on 01/08/17.
 */
public class JavastackParanthesis {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            String result = isBalanced(input);
            System.out.println(result);
            //System.out.println("NO");
        }

    }

    static String isBalanced(String input ){
        Stack<Character> stack = new Stack();
        for(int i=0;i<input.length();i++){
            char ch  = input.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if(stack.isEmpty()){
                return "NO";

            }else{
                char tos = stack.pop();
                if((tos == '(' && ch != ')') || (tos == '{' && ch != '}') || (tos == '[' && ch != ']')){
                        return "NO";
                }
            }
        }
        return "YES";
    }

    static String isBalanced1(String input ){
        Stack<String> stack = new Stack<String>();
        String isBalanaced ="NO";

        for(int i=0; i < input.length(); i++){
            String str = ""+input.charAt(i);		//store characters as String

            //if opening bracket then push into stack
            if(str.equals("(") || str.equals("[") || str.equals("{")){
                stack.push(str);
            }

            //if closing bracket, pop bracket and compare if its a pair
            if(str.equals(")") || str.equals("]") || str.equals("}")){
                //if stack becomes empty in between then also its not balanced
                if(stack.isEmpty()){
                    return isBalanaced;
                }
                String opening = stack.peek();
                if(str.equals(")") && opening.equals("(")){
                    stack.pop();
                }
                if(str.equals("]") && opening.equals("[")){
                    stack.pop();
                }
                if(str.equals("}") && opening.equals("{")){
                    stack.pop();
                }
            }
        }
        //if stack is empty at end, then its balanced
        if(input.length() > 0 && stack.isEmpty()){
            isBalanaced = "YES";
        }
        return isBalanaced;
    }
}
