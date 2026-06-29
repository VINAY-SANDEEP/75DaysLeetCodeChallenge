class Solution {
    public int numOfStrings(String[] nums, String s) {
        int c = 0;
        for(int i = 0 ; i < nums.length ;i++){
            if(s.contains(nums[i])){
              c++;
            }
        }
        return c;
    }
}