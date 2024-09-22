//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends

class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<exp.length();i++){
            char currentChar = exp.charAt(i);
            if(Character.isLetter(currentChar)){
                res.append(String.valueOf(currentChar));
                continue;
            }
            if(stack.isEmpty())
                stack.push(currentChar);
            else {
                Stack<Character> temp = new Stack<>();
                
                while(currentChar == '+' &&
                (stack.contains('^') || stack.contains('*') || stack.contains('/') ||
                stack.contains('-') || stack.contains('+') )){
                    if(stack.peek() == '(')
                        break;
                    res.append(stack.pop());
                }
                while(currentChar == '-' &&
                (stack.contains('^') || stack.contains('*') || stack.contains('/') || 
                stack.contains('+') || stack.contains('-') )){
                    if(stack.peek() == '(')
                        break;
                    res.append(stack.pop());
                }
                while(currentChar == '*' && stack.contains('/') ){
                    if(stack.peek() == '(')
                        break;
                    res.append(stack.pop());
                }
                while(currentChar == '/' && stack.contains('*') ){
                    if(stack.peek() == '(')
                        break;
                    res.append(stack.pop());
                }
                while(currentChar == '^' && stack.contains('^') ){
                    if(stack.peek() == '(')
                        break;
                    res.append(stack.pop());
                }
                while(currentChar == ')' && stack.contains('(') ){
                    if(stack.peek() == '('){
                        stack.pop();
                        break;
                    }else{
                        res.append(stack.pop());
                    }
                }
                if(currentChar!=')')
                    stack.push(currentChar);
            }
        }
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        // System.out.println(stack);
        return res.toString();
    }
}