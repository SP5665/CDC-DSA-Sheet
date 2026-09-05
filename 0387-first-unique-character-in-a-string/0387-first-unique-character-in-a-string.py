class Solution:
    def firstUniqChar(self, s: str) -> int:
        freq = {}
        for i in range(len(s)):
            if s[i] not in freq:
                freq[s[i]] = i
            else:
                freq[s[i]] = -1
        for v in freq.values():
            if v != -1: return v
        return -1