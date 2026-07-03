class Solution {
public:
    bool isPalindrome(int x) {
        int dup = x;
        long long revNum = 0;
        if(x < 0)   return false;
        while(x != 0){
            int rem = x%10;
            revNum = (revNum*10) + rem;
            x = x/10;
        }
        if(dup == revNum)   return true;
        return false;
    }
};