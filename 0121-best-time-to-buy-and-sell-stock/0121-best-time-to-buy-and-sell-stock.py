class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        maxProfit = 0
        for price in prices:
            buy = min(buy, price)
            maxProfit = max(maxProfit, price-buy)
        return maxProfit