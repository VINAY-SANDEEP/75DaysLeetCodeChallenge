class Solution {
    public int maxDigitRange(int[] nums) {
        int[] arr = new int[nums.length];
        int max = Integer.MIN_VALUE;
       for(int i =0 ; i < nums.length ; i++){
           int element = SmallLarge(nums[i]);
           arr[i]=element;
           max=Math.max(max,arr[i]);
       }
       int sum = 0;
       for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==max){
              sum+=nums[i];
            }
       }
       return sum;
    } 
    public static int SmallLarge(int n){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(n>0){
             int r = n % 10;
            min = Math.min(min, r);
            max = Math.max(max, r);
            n = n / 10;
        }
        return max-min;
    }
}