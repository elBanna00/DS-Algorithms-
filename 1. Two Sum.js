/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    var map = {};
    for(let numbers in nums){
        let targetNum = target - nums[numbers];
        if(targetNum in map){
            var sol =[];
            sol.push(map[targetNum],numbers);
            return sol;
        }
        else{
           map[nums[numbers]]=numbers;
        }
    }

};