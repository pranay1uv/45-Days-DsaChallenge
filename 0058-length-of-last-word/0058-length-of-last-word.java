class Solution {
    public int lengthOfLastWord(String s) {
        // Input is String s
        // Output is integer
        // return Length of the last word in the string s
        // How do i return the length of the last word 
        // last word 
        // traverse from the last of the string
        String[] sarray = s.split(" ");
        String lastWord = sarray[sarray.length-1];

        return lastWord.length();
    }
}