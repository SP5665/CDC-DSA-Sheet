class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        n = len(strs)
        if n == 1: return strs[0]
        idx = len(strs[0])
        i, j, x = 0, 1, 0
        while j<n:
            idx = min(idx, len(strs[j]))
            while x<idx and strs[i][x] == strs[j][x] : x+=1
            idx, x = x, 0
            i+=1
            j+=1
        return strs[0][:idx]