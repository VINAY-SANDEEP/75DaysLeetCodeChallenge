class Solution {
    public int passwordStrength(String password) {
        int c = 0;
         HashSet<Character> set = new HashSet<>();
         
         for(int i = 0 ; i < password.length() ; i++){
                set.add(password.charAt(i));
         }
         for (char ch : set) {

            if (ch >= 97 && ch <= 122) {
                System.out.println(c = c + 1);
            }

            else if (ch >= 65 && ch <= 90) {
                System.out.println(c = c + 2);
            }

            else if (ch >= 48 && ch <= 57) {
                System.out.println(c = c + 3);
            }

            else {
                System.out.println(c = c + 5);
            }
        }

        return c;
    }
}