/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    var map = {};
    for(let numbers in nums){
        if(nums[numbers] in map){
            return true
        }
        else{
            map[nums[numbers]]=numbers;
        }
    }
    return false;
    
};