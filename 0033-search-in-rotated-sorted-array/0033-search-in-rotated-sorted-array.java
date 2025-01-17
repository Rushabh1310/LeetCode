class Solution {
    public int BS(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (target == nums[m]) {
                return m;
            } else if (target > nums[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
    public int pivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m < e && arr[m] > arr[m + 1]) {
                return m;
            }
            if (m > s && arr[m - 1] > arr[m]) {
                return m - 1;
            }
            if (arr[s] <= arr[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int index = pivot(nums);
        if (index == -1) {
            return BS(nums, target, 0, n - 1);
        }
        if (nums[index] == target) {
            return index;
        }
        if (target >= nums[0] && target <= nums[index]) {
            return BS(nums, target, 0, index);
        }
        return BS(nums, target, index + 1, n - 1);
    }
}