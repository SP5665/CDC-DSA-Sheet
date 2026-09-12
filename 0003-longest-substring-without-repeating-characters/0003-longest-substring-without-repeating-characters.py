class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ch = set()
        c, i, j = 0, 0, 0
        for j in range(len(s)):
            while s[j] in ch:
                ch.remove(s[i])
                i+=1
            ch.add(s[j])
            c = max(c, j-i+1)
        return c