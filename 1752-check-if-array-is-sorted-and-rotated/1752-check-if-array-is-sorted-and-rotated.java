class Solution {
    public boolean check(int[] nums) {
    // an ascending array which is rotated can have one drop at max
    int drop = 0;
    for(int i = 0; i < nums.length - 1; i++){
        if(nums[i] > nums[i+1]) drop += 1;
    }
    if(nums[nums.length - 1] > nums[0]) drop += 1;

    if(drop > 1)    return false;
    return true;
    }
}