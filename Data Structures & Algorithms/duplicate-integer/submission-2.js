class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const ret = new Set();
        for(const num of nums) {
            if(ret.has(num)) {
                return true;
            } else {
                ret.add(num);
            }
        }
        return false;
    }
}
