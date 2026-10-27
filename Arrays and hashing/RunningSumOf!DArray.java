// 1480. Running Sum of 1d Array
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Hint
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


//SOLUTION
//Brute force approach
class Solution1 {
    public int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                res[i] = res[i]+nums[j];
            }
        }
        return res;
    }
}

//using prefix sum approach
class Solution2 {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}