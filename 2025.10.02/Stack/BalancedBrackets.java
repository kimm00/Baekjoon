import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            if (c == '(' || c == '{' || c =='['){
                stack.push(c);
            } else {
                if(stack.isEmpty()) return "NO";
                char top = stack.pop();
                if ( (c==')') && top !='(' ||
                     (c=='}') && top !='{' ||
                     (c==']') && top !='['
                ) {
                    return "NO";
                }      
            }
        }
        return stack.isEmpty() ? "YES" : "NO";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            String result = Result.isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
