class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++;  // move to the next child as this one is satisfied
            }
            cookie++;  // move to the next cookie
        }
        return child;
    }
}
