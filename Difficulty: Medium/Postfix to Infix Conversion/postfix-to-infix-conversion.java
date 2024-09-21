//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        Stack<String> st = new Stack<>();
        int i = 0;
        while ( i < exp.length()) {
            String ch = String.valueOf(exp.charAt(i));
            if (Character.isLetterOrDigit(exp.charAt(i))){
                st.push(ch);
            }
            else {
                String top1 = st.peek();
                st.pop();
                String top2 = st.peek();
                st.pop();
                st.push(new String("(" + top2 + ch + top1 + ")"));
            }
            i++;
        }
        return st.peek();
    }
}