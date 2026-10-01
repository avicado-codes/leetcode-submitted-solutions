class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] char_array = new int[26];

        for(int i = 0; i < s.length(); i++){
            char_array[s.charAt(i) - 'a']++;
            char_array[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(char_array[i] != 0){
                return false;
            }
        }
        return true;
    }
}