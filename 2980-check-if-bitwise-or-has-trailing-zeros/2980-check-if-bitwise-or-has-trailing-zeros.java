class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int even = 0;
        for(int num:nums){
            if(num%2==0){
                even++;
            }
        }
        return even>=2;
    }
}