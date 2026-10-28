// 238. Product of Array Except Self
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

// You must write an algorithm that runs in O(n) time and without using the division operation.

 

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

//SOLUTION

//brute force approach
import java.util.Arrays;
class Solution1 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        Arrays.fill(prefix,1);
        Arrays.fill(suffix,1);
        prefix[0] = 1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i-1]; 
        }
        suffix[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i+1]; 
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
                ans[i] = (prefix[i]*suffix[i]);
        }
        return ans;
    }
}


//optimized approach

class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i] = suffix; 
            suffix = suffix*nums[i];
        }
        int prefix=1;
        for(int i=0;i<nums.length;i++){
            res[i] = prefix*res[i];
            prefix = prefix*nums[i];
        }
        return res;
    }
}