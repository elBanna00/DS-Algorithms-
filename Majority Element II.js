/**
 * @param {number[]} nums
 * @return {number[]}
 */
var majorityElement = function(nums) {
    const soln = new Map();
    const allsoln = [];
    for(i of nums){
        if(!soln[i]) soln[i] = 1
        else soln[i]++
        if(soln[i] > nums.length/3)  allsoln.push(i)
    }
    let set = new Set(allsoln);
    return Array.from(set)
};
