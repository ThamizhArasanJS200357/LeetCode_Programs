import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void DutchNationalFlag(int[] arr)
    {
        //Write your code here
        int l=0;
        int m=0;
        int h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                swap(arr,l,m);
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                swap(arr,m,h);
                h--;
            }
        }
    }
    private static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}


// Sample Input 1 :
// 2
// 6
// 0 1 2 2 1 0
// 7
// 0 1 2 1 2 1 2
// Sample Output 1 :
// 0 0 1 1 2 2
// 0 1 1 1 2 2 2
// Sample Input 2 :
// 2
// 7
// 2 2 2 1 1 1 0
// 6
// 2 1 2 0 1 0
// Sample Output 2 :
// 0 1 1 1 2 2 2
// 0 0 1 1 2 2


// LINK:https://www.naukri.com/code360/problems/sort-0-1-2_631055?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM