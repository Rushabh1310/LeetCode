class Solution {
    public int characterReplacement(String s, int k) {
        int right = 0, left = 0, maxLen = 0, maxFreq = 0;
        int[] hash = new int[26];

        while (right < s.length()) {
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                hash[s.charAt(left) - 'A']--;
                maxFreq = 0;
                for (int i = 0; i < hash.length; i++) {
                    if (hash[i] > maxFreq) {
                        maxFreq = hash[i];
                    }
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}