class Solution {
    public int[] sortArray(int[] nums) {
        nums = mergeSort(nums);
        return nums;
    }
    public int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    public int[] merge(int[] a, int[] b) {
        int[] mix = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                mix[k++] = b[j++];
            } else {
                mix[k++] = a[i++];
            }
        }
        while (i < a.length) {
            mix[k++] = a[i++];
        }
        while (j < b.length) {
            mix[k++] = b[j++];
        }
        return mix;
    }
}