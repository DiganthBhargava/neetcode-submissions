class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        // return s.toLowerCase().replace(/[^a-z0-9]/g,'')==s.toLowerCase().replace(/[^a-z0-9]/g,'').split('').reverse().join('');
        s = s.toLowerCase().replaceAll(/[^a-z0-9]/g,'');
        console.log(s);
        for(let i=0;i<s.length/2;i++) {
            console.log(s.charAt(i)+' and '+s.charAt(s.length-i-1))
            if(s.charAt(i) != s.charAt(s.length-i-1)) return false;
        }
        return true;
    }
}
//  qwerrewq
//   |    |