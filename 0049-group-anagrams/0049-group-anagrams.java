class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            int[] charArray = new int[26];
            for(int j = 0; j < strs[i].length(); j++){
                charArray[strs[i].charAt(j) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int count : charArray){
                sb.append(count);
                sb.append('#'); // delimiter
            }
            String fingerprint = sb.toString();
            if(hmap.containsKey(fingerprint)){
                List<String> existingList = hmap.get(fingerprint);
                existingList.add(strs[i]);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                hmap.put(fingerprint,newList);
            }
        }
        return new ArrayList<>(hmap.values());
    }
}