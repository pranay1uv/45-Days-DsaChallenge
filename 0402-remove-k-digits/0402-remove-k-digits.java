class Solution {
    public String removeKdigits(String num, int k) {
        String a = "0";
        if (num.length() == k) return a;
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < num.length(); j++) {
            char c = num.charAt(j);
            if (sb.length() == 0) sb.append(c);
            else if (sb.charAt(sb.length() - 1) - '0' > c - '0' && k != 0) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
                j--;
            } else sb.append(c);
        }
        
        while (k != 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }
        
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        if (sb.length() == 0) return a;
        return sb.toString();
    }
}