class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> noduplicate = new  HashSet<Integer>();
        for(int i = 0 ; i < arr.length ; i++){
            noduplicate.add(arr[i]);
        }
        for(int i = 1 ; i <= arr.length; i++){
           if(!noduplicate.contains(i)){
             list.add(i);
           }
        }
        return list;
    }
}