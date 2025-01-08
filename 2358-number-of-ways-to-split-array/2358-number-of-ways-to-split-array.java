class Solution {
    public int waysToSplitArray(int[] nums) {
        long sumCurr = 0;
        long sumTotal = 0;
        int count = 0;
        for (int n : nums) {
            sumTotal += n;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            sumCurr += nums[i];
            if (sumCurr >= sumTotal - sumCurr) {
                count++;
            }
        }
        return count;
    }
}