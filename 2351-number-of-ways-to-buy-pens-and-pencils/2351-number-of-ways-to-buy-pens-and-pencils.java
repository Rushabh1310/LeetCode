class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0;
        if (cost1 > total && cost2 > total) {
            return 1;
        }
        int pens = total / cost1;
        for (int i = 0; i <= pens; i++) {
            int remaning = total - (i * cost1);
            int pencils = remaning / cost2;
            ans += pencils + 1;
        }
        return ans;
    }
}