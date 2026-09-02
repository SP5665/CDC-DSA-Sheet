class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        slist = sorted(s)
        tlist = sorted(t)
        return slist == tlist