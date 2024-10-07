class Solution {
    public int minLength(String s) {
        // Continue as long as "AB" or "CD" is found in the string
        while (s.contains("AB") || s.contains("CD")) {
            s = s.replace("AB", "").replace("CD", "");
        }
        return s.length();
    }
}
