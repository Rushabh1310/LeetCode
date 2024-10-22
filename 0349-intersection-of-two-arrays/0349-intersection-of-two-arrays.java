class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int n : nums2) {
            if (map.containsKey(n)) {
                map2.put(n, map2.getOrDefault(n, 0) + 1);
            }
        }
        List<Integer> list = new ArrayList<>(map2.keySet());
        int[] ans = new int[list.size()];
        int i = 0;
        for (int n : list) {
            ans[i] = list.get(i);
            i++;
        }
        return ans;
    }
}