class Solution {
    public boolean isValid(String s) {
        // When you encounter an opening bracket, push it to the top of the stack.
        // When you encounter a closing bracket, check if the top of the stack was the opening for it. 
        // If yes, pop it from the stack. Otherwise, return false.
        Stack<Character> st = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                if(st.empty()){
                    return false;
                }
                if(map.get(st.peek()) == s.charAt(i)){
                    st.pop(); // found the Last Opening Bracket for the current Closing Bracket
                }else{
                    return false;
                }
            }
        }return st.empty();
    }
}