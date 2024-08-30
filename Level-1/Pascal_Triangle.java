class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>st=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>t=new ArrayList<>();
            int n=1;
            for(int j=0;j<=i;j++){
                t.add(n);
                n=n*(i-j)/(j+1);
            }
            st.add(t);
        }
        return st;
    }
}

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]

//LINK:https://leetcode.com/problems/pascals-triangle/description/