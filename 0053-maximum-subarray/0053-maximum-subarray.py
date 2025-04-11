class Solution(object):
    def maxSubArray(self, nums):
        current_sum = 0
        max_sum = float("-inf")
        start_max = 0
        end_max =0
        start_current = 0
        for i in range(len(nums)):
            current_sum += nums[i]
            if current_sum > max_sum :
                max_sum = current_sum
                start_max = start_current
                end_max = i
            if current_sum < 0 :
                current_sum = 0
                start_current = i+1
        max_subarr = nums[start_max : end_max+1] 
        return max_sum

obj = Solution()
nums = [5,4,-1,7,8]
obj.maxSubArray(nums)   
