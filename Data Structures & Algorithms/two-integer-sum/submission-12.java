class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> i = new Hashtable<>();

        for(int j=0;j<nums.length;j++) {
            int check = target-nums[j];
            if(i.containsKey(check)) return new int[]{i.get(check),j};
            i.put(nums[j],j);
        }
        return new int[]{0,0};
    }
}
