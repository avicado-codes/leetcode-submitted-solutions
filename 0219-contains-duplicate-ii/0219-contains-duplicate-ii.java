class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!hset.add(nums[i]))    return true;
            if(hset.size() > k){
                hset.remove(nums[i-k]);
            }
        }
        return false;
    }
}