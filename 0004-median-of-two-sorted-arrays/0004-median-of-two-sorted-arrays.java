class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        // Merge the two arrays in sorted order
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                i++;
            } else {
                ans[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while (j < m) {
            ans[k] = nums2[j];
            j++;
            k++;
        }

        // Return the median
        if (ans.length % 2 == 1) { // Odd Length
            return ans[ans.length / 2];
        } else { // Even Length
            return (ans[ans.length / 2 - 1] + ans[ans.length / 2]) / 2.0;
        }
    }
}