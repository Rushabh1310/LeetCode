class Solution {
    public int countEven(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }
    public boolean check(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return (sum & 1) == 0;
    }
}