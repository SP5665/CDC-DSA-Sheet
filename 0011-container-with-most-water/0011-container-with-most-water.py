class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        i, j, area = 0, n-1, 0
        while (i<j):
            w = j-i
            h = min(height[i], height[j])
            area = max(area, w*h)
            if (height[i] < height[j]): i+=1
            else: j-=1
        return area