class Solution(object):
    def containsDuplicate(self, nums):
        localNums = nums
        hasDupe = False
        for i in range(len(nums)):
            for j in range(len(nums)):
                if(i != j & nums[i] == nums[j]):
                    hasDupe = True
                    break
            if(hasDupe):
                break
        return hasDupe

testcases = [1,2,3]
obj = Solution
contains = obj.containsDuplicate(obj, testcases)
print(contains)