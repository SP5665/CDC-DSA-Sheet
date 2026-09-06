class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        for num in nums:
            freq[num] = freq.get(num, 0) + 1
        heap = []
        for key, count in freq.items():
            heapq.heappush(heap, (count, key))
            if len(heap) > k:
                heapq.heappop(heap)
        return [key for count, key in heap]