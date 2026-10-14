class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num:nums) {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }

        return hm.entrySet().stream()
        .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
        .limit(k)
        .mapToInt(Map.Entry::getKey)
        .toArray();
    }
}
