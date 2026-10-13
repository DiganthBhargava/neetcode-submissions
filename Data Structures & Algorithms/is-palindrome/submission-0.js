class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        console.log(s.toLowerCase().replace(/[^a-z0-9]/g,''));
        console.log(s.toLowerCase().replace(/[^a-z0-9]/g,'').split('').reverse().join(''));
        return s.toLowerCase().replace(/[^a-z0-9]/g,'')==s.toLowerCase().replace(/[^a-z0-9]/g,'').split('').reverse().join('');
    }
}
