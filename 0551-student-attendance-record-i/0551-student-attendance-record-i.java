class Solution {
    public boolean checkRecord(String s) {
              int c = 0;      
        int cons = 0;   

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == 'A') {
                c++;
                if(c >= 2) return false;
            }

            if(ch == 'L') {
                cons++;
                if(cons >= 3) return false;
            } else {
                cons = 0;  
            }
        }
        return true;
    }
}