class Solution {
    public int[] findErrorNums(int[] arr) {
    int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int repeating = -1;

        // Find repeating
        for(int i = 0; i < n; i++) {

            if(set.contains(arr[i])) {
                repeating = arr[i];
            }

            set.add(arr[i]);
        }

        int missing = -1;
        for(int i = 1; i <= n; i++) {

            if(!set.contains(i)) {
                missing = i;
            }
        }
       return new int[]{repeating,missing};
    }
}