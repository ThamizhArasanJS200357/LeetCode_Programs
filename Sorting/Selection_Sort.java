

public class Selection_Sort
{
	int  select(int arr[], int i)
	{
        int minIndex = i;
        for (int j = i + 1; j < arr.length; j++) { 
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for (int i = 0; i < n - 1; i++) { 
            int minIndex = select(arr, i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
	    
	}
} 



// Example 1:

// Input:
// N = 5
// arr[] = {4, 1, 3, 9, 7}
// Output:
// 1 3 4 7 9
// Explanation:
// Maintain sorted (in bold) and unsorted subarrays.
// Select 1. Array becomes 1 4 3 9 7.
// Select 3. Array becomes 1 3 4 9 7.
// Select 4. Array becomes 1 3 4 9 7.
// Select 7. Array becomes 1 3 4 7 9.
// Select 9. Array becomes 1 3 4 7 9.
// Example 2:

// Input:
// N = 10
// arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Output:
// 1 2 3 4 5 6 7 8 9 10

// LINK:https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort