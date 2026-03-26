class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double maxAvg = -Double.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            maxAvg = Math.max(maxAvg, (double) sum / k);
        }

        return maxAvg;
    }
}