class Solution {
    public void nextPermutation(int[] nums) {
        int idx = 0;
        for(int i = nums.length - 1; i >= 1; i--){
            if(nums[i-1] < nums[i]){
                idx = i; // index of the element which is greater(greater -> smaller == drop)
                break;
            }
        }
        if(idx != 0){
            for(int i = nums.length - 1; i >= idx; i--){
                if(nums[i] > nums[idx-1]){
                    int temp = nums[i];
                    nums[i] = nums[idx-1];
                    nums[idx-1] = temp;

                    break;
                }
            }
        }
        
        // reversing the array
        int i = idx, j = nums.length-1;
        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++; j--;
        }

    }
}