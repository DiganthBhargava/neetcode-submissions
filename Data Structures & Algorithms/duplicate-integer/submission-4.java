class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> s = new Hashtable<>();
        for(int i=0;i<nums.length;i++) {
            if(s.containsKey(nums[i])) return true;
            s.put(nums[i],1);
        }
        return false;
    }
}