class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    count++;
                }
            }
        }
        return count;
    }
}