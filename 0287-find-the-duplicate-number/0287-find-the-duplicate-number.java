class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
    while(i < nums.length){
        int value = nums[i]-1;
        if(nums[i]!=nums[value]){
            int temp = nums[i];
            nums[i]=nums[value];
            nums[value]=temp;
        }
        else{
            i++;
        }
    }
    return nums[nums.length-1];
    }
}