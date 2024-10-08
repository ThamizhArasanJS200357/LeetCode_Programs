// Two_Sum_1

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=nums.length;
        for(int i=0;i<s-1;i++){
            for(int j=i+1;j<s;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

//LINK:https://leetcode.com/problems/two-sum/description/
