class insertion_Sort
{
  static void insert(int arr[],int i)
  {
       // Your code here
       int j=i;
       while(j>0&&arr[j-1]>arr[j]){
           int temp=arr[j-1];
           arr[j-1]=arr[j];
           arr[j]=temp;
           j--;
       }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=0;i<=n-1;i++){
          insert(arr,i);
      }
      
  }
}


// Examples:

// Input: n = 5, arr[] = { 4, 1, 3, 9, 7}
// Output: 1 3 4 7 9
// Input: n = 10, arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
// Output: 1 2 3 4 5 6 7 8 9 10


// LINK:https://www.geeksforgeeks.org/problems/insertion-sort/0?category%5B%5D=Algorithms&page=1&query=category%5B%5DAlgorithmspage1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insertion-sort
