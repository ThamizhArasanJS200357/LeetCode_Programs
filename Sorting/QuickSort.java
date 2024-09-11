// QuickSort

class QuickSort
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    static int partition(int arr[], int low, int high)
    {
        // your code here
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
        
    } 
}

// Example 1:

// Input: 
// N = 5 
// arr[] = { 4, 1, 3, 9, 7}
// Output:
// 1 3 4 7 9
// Example 2:

// Input: 
// N = 9
// arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
// Output:
// 1 1 2 3 4 6 7 9 10


// LINK:https://www.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort
