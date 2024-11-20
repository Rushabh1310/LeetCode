class Solution {
    public int minimumChairs(String s) {
        int ans = 0;
        int chair = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') {
                chair++;
            } else {
                chair--;
            }
            ans = Math.max(chair, ans);
        }
        return ans;
    }
}