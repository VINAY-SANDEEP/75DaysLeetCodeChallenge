class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        //step 1:
        //k==arr[numbers]
        ArrayList<Integer> list = new ArrayList<>();
        int c = 1;
        list.add(nums[0]);
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i]==nums[i-1]){
              c++;
            }else{
                c = 1;
            }
             if(c<=k){
                list.add(nums[i]);
             }
        }
        int[] chetana = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
           chetana[i]=list.get(i);
        }
        return chetana;
    }
}