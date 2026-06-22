class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0)    return true;
        else{
            int rem = num % 10;
            if(rem == 0)    return false; // for even one trailing zero
            return true;
        }
    }
}