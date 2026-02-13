class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        pro = 0
        b_p = prices[0]
        for i in prices[1:]:
            if b_p > i:
                b_p = i
            pro = max(pro,i-b_p)
        return pro
        