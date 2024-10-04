class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans = 0;
        for (int pens = 0; pens <= total / cost1; pens++) {
            int remainingMoney = total - pens * cost1;
            int pencils = remainingMoney / cost2;
            ans += (pencils + 1);
        }
        return ans;
    }
}
