class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> list = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            HashSet<Integer> seen = new HashSet<>();
            for(int j = i + 1 ; j < nums.length ; j++){
                int sum = -(nums[i]+nums[j]);
                if(seen.contains(sum)){
                    List<Integer> find = Arrays.asList(nums[i],nums[j],sum);
                    Collections.sort(find);
                    list.add(find);
                }
                 seen.add(nums[j]);
            }
        }
      return new ArrayList<>(list);
    }
}