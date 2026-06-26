#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> numsMap;
        // for (int i = 0; i < nums.size(); i++) {
        //     numsMap[nums[i]] = i; // key(element) : val(index)
        // }
        
        for(int i = 0; i < nums.size(); i++){
            int rem = target - nums[i];

            // check the previous entries if those match
            if (numsMap.find(rem) != numsMap.end()) {
                return {numsMap[rem], i};
            }

            numsMap[nums[i]] = i;
        }

        return {};
    }
};