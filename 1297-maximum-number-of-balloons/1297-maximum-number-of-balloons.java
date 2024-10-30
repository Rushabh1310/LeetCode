class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] arr = new char[26];
        int count = 0;
        boolean flag = true;
        for (char c : text.toCharArray()) {
            arr[c - 'a']++;
        }
        while (flag) {
            for (char c : "balloon".toCharArray()) {
                if (arr[c - 'a']-- <= 0) {
                    return count;
                }
            }
            count++;
        }
        return count;
    }
}