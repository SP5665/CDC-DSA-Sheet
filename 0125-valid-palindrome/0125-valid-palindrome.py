class Solution:
    def isPalindrome(self, s: str) -> bool:
        ans = re.sub(r'[^a-zA-Z0-9]', '', s.lower().strip())
        print(ans)
        for i in range(len(ans)):
            if ans[i] != ans[len(ans)-i-1]: return False
        return True