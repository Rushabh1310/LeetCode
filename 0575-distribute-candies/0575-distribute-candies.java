class Solution {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
            if (set.size() == max) {
                return max;
            }
        }
        return set.size();
    }
}