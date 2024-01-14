/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
  let charCount = new Map();
  if (s.length !== t.length) return false;

  for (let i of s) {
    charCount.set(i, (charCount.get(i) || 0) + 1);
  }
  for (let i of t) {
    if (!charCount.has(i) || charCount.get(i) === 0) return false;
    charCount.set(i, charCount.get(i) - 1);
  }
  return true;
};
