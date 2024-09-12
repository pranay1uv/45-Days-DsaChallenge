class Solution {
    public String removeDuplicates(String s) {
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
        return st.toString().replaceAll("[^A-Za-z0-9]","");
    }
}