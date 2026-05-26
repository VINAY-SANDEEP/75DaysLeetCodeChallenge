class Solution {
    public int numberOfSpecialChars(String word) {
       HashSet<Character> set = new HashSet<>();
   for(char ch :word.toCharArray()){
       set.add(ch);
   }
   int c = 0;
   for(char ch : set){
    if(Character.isLowerCase(ch) && set.contains(Character.toUpperCase(ch))){
        c++;
    }
   }
   return c;
    }
}