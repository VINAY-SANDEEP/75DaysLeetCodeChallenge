class Solution {
    public int maxProfit(int[] nums) {
     int min = nums[0];
     int m = 0;
     for(int i = 1 ; i < nums.length ; i++){
        int profit = nums[i]-min;
        m = Math.max(m,profit);
        min = Math.min(min,nums[i]);
     }
     return m;
    }
}

