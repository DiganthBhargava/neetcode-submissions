class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        //last in first out -> stack
        const stack = [];
        var pair = {
            ')':'(',
            ']':'[',
            '}':'{'
        };
        for(let bracket of s) {
            if(pair[bracket]) {
                if(stack.length>0 && (stack[stack.length-1] == pair[bracket])) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(bracket);
            }
        }
        if(stack.length>0) return false;
        return true;
    }
}
