class Solution {
    public boolean isPalindrome(int x) {
        String numStr = Integer.toString(x);
        int i = 0, j = numStr.length()-1;
        while(i < j){
            if(numStr.charAt(i) != numStr.charAt(j))    return false;
            i++; j--;
        }
        return true;
    }
}