// Missing_in_Array

class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int t=(n*(n+1))/2;
        int s=0;
        for(int i=0;i<n-1;i++){
            s+=arr[i];
        }
        return t-s;
    }
}

// Input: n = 5, arr[] = [1,2,3,5]
// Output: 4
// Explanation : All the numbers from 1 to 5 are present except 4.
// Input: n = 2, arr[] = [1]
// Output: 2
// Explanation : All the numbers from 1 to 2 are present except 2.

// LINK:https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1?page=1&difficulty=School,Basic,Easy,Medium&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
