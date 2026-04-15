class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int abs = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0  ; i < nums.length ; i++){
            if(nums[i]==target){
                abs = Math.abs(i-start);
                min = Math.min(min,abs);
            }
        }
        return min;
    }
}