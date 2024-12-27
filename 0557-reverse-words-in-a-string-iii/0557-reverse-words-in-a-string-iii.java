class Solution {
    public String reverse(String x) {
        StringBuilder sb = new StringBuilder(x);
        return sb.reverse().toString();
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            result.append(reverse(arr[i]) + " ");
        }
        return result.toString().trim();
    }
}