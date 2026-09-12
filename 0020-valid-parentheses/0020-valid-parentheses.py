class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        mapping = {")": "(", "]": "[", "}": "{"}  
        for c in s:
            # c : key (closing)
            # mapping[c] : value (opening/0)
            if c in mapping:
                if not stack or stack[-1] != mapping[c]: return False
                stack.pop()
            else: stack.append(c)
        return stack == []