class Solution:
    def search(self, nums: List[int], target: int) -> bool:
        if target in nums:
            return target==target
        else:
            return target==-1