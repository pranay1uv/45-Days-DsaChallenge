class Solution {
    public String removeDuplicates(String s) {
        // Input is String s
        // output is String
        // you should not compare string characters within the String
        // you should compare the characters in the string with the characters in the stack 
        // My procedure of pushing and popping is done
        // Now how do i return the string from the stack
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            if(st.empty()){
                st.push(s.charAt(i));
            }else{
                char c = st.peek();
                if(s.charAt(i) == c){
                    st.pop();
                }else{
                    st.push(s.charAt(i));
                }
            }
        }
        char[] ch = new char[st.size()];
        for(int j = ch.length-1; j>=0; j--){
            ch[j] = st.pop();
        }
        return String.valueOf(ch);
    }
}