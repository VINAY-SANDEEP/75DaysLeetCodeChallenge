class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        return white(c1)==white(c2);
    }
     public boolean white(String s) {
        if(s.charAt(0)%2==1 && (s.charAt(1)-'0')%2==1){
            return false;
        }
        if(s.charAt(0)%2==0 && (s.charAt(1)-'0')%2==0){
            return false;
        }
        return true;
    }
}