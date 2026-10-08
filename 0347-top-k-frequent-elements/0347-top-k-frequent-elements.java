class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length){
            return nums; // as all the element appears only once in this case
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }
        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> hmap.get(a)-hmap.get(b)
        );
        for(int key : hmap.keySet()){
            heap.add(key);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = heap.poll();
        }
        return res;
    }
}