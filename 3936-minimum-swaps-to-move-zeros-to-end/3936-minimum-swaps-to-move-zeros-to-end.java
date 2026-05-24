class Solution {
    public int minimumSwaps(int[] nums) {
        int c = 0;
        int zero = 0;
      for(int i = 0 ; i < nums.length ; i++){
          if(nums[i]==0){
            zero++;
          }
      }
      for(int i = nums.length-zero ; i < nums.length ; i++){
          if(nums[i]!=0){
           c++;
          }
      }
   return c;
    }
}