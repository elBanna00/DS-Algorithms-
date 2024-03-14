/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
    const solnMap = new Map();
    for (let i of strs) {
        let pattern = new Array(26).fill(0);
        for (let j of i){
        pattern[j.charCodeAt(0)-"a".charCodeAt(0)]++
        }
        let val = solnMap.get(pattern.toString()) || [];
        val.push(i);
        solnMap.set(pattern.toString(),val);
    }
    return [...solnMap.values()] 
};
