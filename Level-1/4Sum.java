import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> st = new ArrayList<>();
        int s = nums.length;
        if (nums == null || s == 0) {
            return st;
        }

        Map<Integer, Integer> ts = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < s; i++) {
            ts.put(nums[i], i);
        }
        Set<String> t = new HashSet<>();

        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                for (int k = j + 1; k < s; k++) {
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    if (target - sum >= Integer.MIN_VALUE && target - sum <= Integer.MAX_VALUE) {
                        if (ts.containsKey((int) (target - sum))) {
                            int g = ts.get((int) (target - sum));
                            if (!t.contains(nums[i] + ":" + nums[j] + ":" + nums[k] + ":" + nums[g]) && g > i && g > j && g > k) {
                                st.add(Arrays.asList(nums[i], nums[j], nums[k], nums[g]));
                                t.add(nums[i] + ":" + nums[j] + ":" + nums[k] + ":" + nums[g]);
                            }
                        }
                    }
                }
            }
        }
        return st;
    }
}


// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// Example 2:

// Input: nums = [2,2,2,2,2], target = 8
// Output: [[2,2,2,2]]

// LINK:https://leetcode.com/problems/4sum/description/