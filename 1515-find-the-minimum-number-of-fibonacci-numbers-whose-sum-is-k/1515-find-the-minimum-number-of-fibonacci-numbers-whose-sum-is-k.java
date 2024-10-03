class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> fib = new ArrayList<>();
        int a = 1, b = 1;
        fib.add(a);
        fib.add(b);
        while (a + b <= k) {
            int c = a + b;
            fib.add(c);
            a = b;
            b = c;
        }
        int count = 0;
        int sum = 0;
        for (int i = fib.size() - 1; i >= 0; i--) {
            if (sum + fib.get(i) <= k) {
                sum += fib.get(i);
                count++;
            }
            if (sum == k) {
                return count;
            }
        }
        return -1;
    }
}
