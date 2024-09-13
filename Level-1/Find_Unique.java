// Find Unique


import java.util.ArrayList;
import java.util.Collections;

public class Find_Unique{  

    public static int findUnique(int[] arr){
		//Your code goes here
    ArrayList<Integer>st=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
      st.add(arr[i]);
    }
    for(int i:st){
      int k=Collections.frequency(st,i);
      if(k==1){
        return i;
      }
    }
    return -1;
    }
}


// Sample Input 1:
// 1
// 7
// 2 3 1 6 3 6 2
// Sample Output 1:
// 1
// Explanation: The array is [2, 3, 1, 6, 3, 6, 2]. Here, the numbers 2, 3, and 6 are present twice, and the number 1 is present only once. So, the unique number in this array is 1.
// Sample Input 2:
// 2
// 5
// 2 4 7 2 7
// 9
// 1 3 1 3 6 6 7 10 7
// Sample Output 2:
// 4
// Explanation: In the first test case, the array is [2, 4, 7, 2, 7]. Here, the numbers 2 and 7 are present twice, and the number 4 is present only once. So, the unique number in this array is 4.

// 10
// Explanation: In the second test case, the array is [1, 3, 1, 3, 6, 6, 7, 10, 7]. Here, the numbers 1, 3, 6, and 7 are present twice, and the number 10 is present only once. So, the unique number in this array is 10.


// LINK:https://www.naukri.com/code360/problems/find-unique_625159?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&practice_topic%5B%5D=Dynamic%20Programming&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM
