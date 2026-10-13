class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> i = new Hashtable<>();

        for(int j=0;j<nums.length;j++) {
            if(i.containsKey(target-nums[j])) return new int[]{i.get(target-nums[j]),j};
            i.put(nums[j],j);
        }
        return new int[]{0,0};
    }
}
