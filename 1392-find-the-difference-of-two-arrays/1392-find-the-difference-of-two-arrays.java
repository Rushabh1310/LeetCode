class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }
        for (int n : nums2) {
            set2.add(n);
        }
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        for (int n : set1) {
            if (!set2.contains(n)) {
                t1.add(n);
            }
        }
        for (int n : set2) {
            if (!set1.contains(n)) {
                t2.add(n);
            }
        }
        ans.add(t1);
        ans.add(t2);
        return ans;
    }
}