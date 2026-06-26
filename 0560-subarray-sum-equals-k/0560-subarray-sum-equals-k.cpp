#include <bits/stdc++.h>
using namespace std;
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> preSumMap;
        int sum = 0, cnt = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums[i];
            if(sum == k){
                cnt++;
            }
            int rem = sum - k;
            if(preSumMap.find(rem) != preSumMap.end()){
                cnt += preSumMap[rem];
            }
            if(preSumMap.find(sum) == preSumMap.end()){
                preSumMap[sum] = 1; // counting the frequency
            }
            else preSumMap[sum]++;
        }
        return cnt;
    }
};