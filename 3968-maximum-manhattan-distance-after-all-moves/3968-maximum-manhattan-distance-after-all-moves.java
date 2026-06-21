class Solution {
    public int maxDistance(String s) {
        int x= 0;
        int y= 0;
        int c= 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='U'){
               x++;
            }
            else if(ch=='D'){
                x--;
            }
            else if(ch=='L'){
                y--;
            }
            else if(ch=='R'){
                y++;
            }else{
                c++;
            }
        }
        return Math.abs(x)+Math.abs(y)+c;
    }
}