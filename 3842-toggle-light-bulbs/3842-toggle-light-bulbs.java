class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> list = new ArrayList<Integer>();
        boolean[] check = new boolean[101];
        for(int i = 0 ; i < bulbs.size() ; i++){
            int bulb = bulbs.get(i);
            check[bulb] = !check[bulb];
        }
        for (int i = 1; i <= 100; i++) {
            if (check[i]) {
                list.add(i);
            }
        }
    
        return list;
    }
}