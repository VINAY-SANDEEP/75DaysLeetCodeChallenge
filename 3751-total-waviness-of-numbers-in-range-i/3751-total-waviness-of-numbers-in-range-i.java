class Solution {
    public int totalWaviness(int num1, int num2) {
          int sum = 0;
        for(int i = num1 ; i <= num2 ;i++){
            sum+=fun(i);
        }
        return sum;
    }
    public static int fun(int n){
      String s =  Integer.toString(n);
       char[] ch = s.toCharArray();
       int c = 0;
       for(int i = 1 ; i < ch.length-1; i++){
        if((ch[i] > ch[i-1] && ch[i]>ch[i+1]) || (ch[i] < ch[i-1] && ch[i] < ch[i+1])){
            c++;
        }
       }
       return c;
    }
}