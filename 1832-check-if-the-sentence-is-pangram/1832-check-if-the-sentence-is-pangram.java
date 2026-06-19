class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] check = new boolean[26];
        if(s.length()<26){
            return false;
        }
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            check[ch-'a']=true;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(!check[i]){
                return false;
            }
        }
        return true;
    }
}