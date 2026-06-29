class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // KADANE'S ALGORITHM
        int sum = 0, maxsum = INT_MIN;
        // to find the subarray with the maximum sum
        // int ansStart, ansEnd;
        for(int i = 0; i < nums.size(); i++){
            // if(sum == 0) int startIdx = i;
            sum += nums[i];
            if(sum > maxsum){
                maxsum = sum;
                // ansStart = startIdx; ansEnd = i;
            }
            if(sum < 0) sum = 0;
        }

        return maxsum;
    }
};