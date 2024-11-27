class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i), index);
            }
            if (!mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), index);
            }
            if (mapS.get(s.charAt(i)) != mapT.get(t.charAt(i))) {
                return false;
            }
            index++;
        }
        return true;
    }
}