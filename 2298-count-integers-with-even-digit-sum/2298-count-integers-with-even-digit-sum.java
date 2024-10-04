class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            int sum = 0;
            int n = i;
            while (n != 0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}