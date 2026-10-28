// 189. Rotate Array
// Solved
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

// Example 1:

// Input: nums = [1,2,3,4,5,6,7], k = 3
// Output: [5,6,7,1,2,3,4]
// Explanation:
// rotate 1 steps to the right: [7,1,2,3,4,5,6]
// rotate 2 steps to the right: [6,7,1,2,3,4,5]
// rotate 3 steps to the right: [5,6,7,1,2,3,4]


//SOLUTION

//brute force approach
class Solution1 {
    public void rotate(int[] nums, int k) {
        for(int j=0;j<k;j++){
            int temp = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
        }

    }
}


//optimizing using by modules %k to reduce rotate
class Solution2 {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        for(int j=0;j<k;j++){
            int temp = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
        }

    }
}

//OPTIMAL SOLUTION with split and reverse approach
class Solution3 {
    void rotate(int nums[],int st,int end){
        while(st<=end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        rotate(nums,0,nums.length-k-1);
        rotate(nums,nums.length-k,nums.length-1);
        rotate(nums,0,nums.length-1);

    }
}