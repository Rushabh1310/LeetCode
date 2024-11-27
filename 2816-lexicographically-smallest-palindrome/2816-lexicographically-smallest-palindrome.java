class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            char c = (char)(Math.min(arr[i], arr[j]));
            arr[i++] = c;
            arr[j--] = c;
        }
        return new String(arr);
    }
}