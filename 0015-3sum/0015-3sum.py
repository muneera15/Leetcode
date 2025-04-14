class Solution(object):
    def threeSum(self, nums):
        nums.sort()
        n = len(nums)
        ans = []
        for i in range(n):
            if i!=0 and nums[i] == nums[i-1]:
                continue
            j = i+1
            k = n-1
            while j < k :
                sum = nums[i]+nums[j]+nums[k]
                if sum < 0 :
                    j = j+1
                elif sum > 0 :
                    k = k-1
                else : 
                    temp = [nums[i],nums[j],nums[k]]
                    ans.append(temp)
                    j = j+1
                    k = k-1
                    while j < k and nums[j] == nums[j-1] :
                        j = j+1
                    while j < k and nums[k] == nums[k+1] :
                        k = k-1
        return ans

obj = Solution()
nums = [-1,0,1,2,-1,-4]
obj.threeSum(nums)