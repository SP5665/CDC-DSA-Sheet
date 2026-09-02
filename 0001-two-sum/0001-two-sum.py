class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mapidx = {}
        for i in range(len(nums)):
            val = target - nums[i]
            if val in mapidx:
                return [i, mapidx[val]]
            else:
                mapidx[nums[i]] = i
        return []