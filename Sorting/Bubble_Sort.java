// Bubble_Sort

class bubble_Sort
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}


// Examples :

// Input: n = 5, arr[] = {4, 1, 3, 9, 7}
// Output: 1 3 4 7 9
// Input: n = 10, arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Output: 1 2 3 4 5 6 7 8 9 10


// LINK:https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort
