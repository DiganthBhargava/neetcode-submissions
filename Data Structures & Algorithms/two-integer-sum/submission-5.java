class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> i = new HashMap<>();

        for(int j=0;j<nums.length;j++) {
            if(i.containsKey(target-nums[j])) return new int[]{i.get(target-nums[j]),j};
            i.put(nums[j],j);
        }
        return new int[]{0,0};
    }
}
