class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, zeroes = 0, maxcnt = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0)    zeroes++;

            while(zeroes > k){
                if(nums[left] == 0) zeroes--;
                left++;
            }

            if(maxcnt < right-left+1)   maxcnt = right-left+1;
        }
        return maxcnt;
    }
}