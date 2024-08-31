// 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>st=new ArrayList<>();
        if(nums==null||nums.length==0){
            return st;
        }
        Map<Integer,Integer>ts=new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            ts.put(nums[i],i);
        }
        Set<String>s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int sum=nums[i]+nums[j];
                if(ts.containsKey(-1*sum)){
                    int k=ts.get(-1*sum);
                    if(!s.contains(nums[i]+":"+nums[j]+":"+nums[k])&& k>i &&k>j){
                        st.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        s.add(nums[i]+":"+nums[j]+":"+nums[k]);
                    }
                }
            }
        }
        return st;
    }
}

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.


// LINK:https://leetcode.com/problems/3sum/description/
