class Solution {

    int countPair(int k, int arr[]) {
        // Complete the function
        int t=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    t+=1;
                }
            }
        }
        return t;
    }
}

// Input: k = 8, arr[] = [1, 2, 3, 4, 5, 6, 7]
// Output: 3
// Explanation: There are 3 pairs which sum up to 8 : {1, 7}, {2, 6}, {3, 5}
// Input: k = 98, arr[] = [1, 2, 3, 4, 5, 6, 7]
// Output: 0
// Explanation: There are no pairs which sum up to 98.

//LINK:https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1