class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(nums);
        int rank = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (!map.containsKey(n)) {
                map.put(n, rank++);
            }
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}