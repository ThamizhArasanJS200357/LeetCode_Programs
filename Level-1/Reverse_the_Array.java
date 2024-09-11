import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Reverse_the_Array
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        // ArrayList<Integer>st=new ArrayList<>();
        // for(int i=0;i<m;i++){
        //     st.add(arr.get(i));
        // }
        // for(int i=arr.size()-1;i>=m+1;i--){
        //     st.add(arr.get(i));
        // }
        // for(int i=0;i<arr.size();i++){
        //     arr.set(i,st.get(i));
        // }
        int k = arr.size();
        int j = 1;
        for(int i = m + 1; i < (m + 1 + (k - (m + 1)) / 2); i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(k - j));  
            arr.set(k - j, temp); 
            j++;
        }

    }
}


// Sample Input 1:
// 2
// 6 3
// 1 2 3 4 5 6
// 5 2
// 10 9 8 7 6
// Sample Output 1:
// 1 2 3 4 6 5
// 10 9 8 6 7
// Explanation 1:
// For the first test case, 
// Considering 0-based indexing we have M = 3 so the 
// subarray[M+1 … N-1] has to be reversed.
// Therefore the required output will be {1, 2, 3, 4, 6, 5}.

// For the second test case, 
// Considering 0-based indexing we have M = 2 so the 
// subarray[M+1 … N-1] has to be reversed.
// Therefore the required output will be {10, 9, 8, 6, 7}.
// Sample Input 2:
// 2
// 7 3
// 1 4 5 6 6 7 7 
// 9 3
// 10 4 5 2 3 6 1 3 6
// Sample Output 2:
//  1 4 5 6 7 7 6
//  10 4 5 2 6 3 1 6 3



// LINK:https://www.naukri.com/code360/problems/reverse-the-array_1262298?utm_source=whatsapp&leftPanelTabValue=PROBLEM
