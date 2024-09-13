// Pair Sum 


import java.util.*;

public class Pair_Sum{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        List<int[]>st=new ArrayList<>(); 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    int p[]=new int[2];
                    p[0]=Math.min(arr[i],arr[j]);
                    p[1]=Math.max(arr[i],arr[j]);
                    st.add(p);
                }
            }
        }
        st.sort((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });

        return st;
    }
}


// Sample Input 1:
// 5 5
// 1 2 3 4 5
// Sample Output 1:
// 1 4
// 2 3
// Explaination For Sample Output 1:
// Here, 1 + 4 = 5
//       2 + 3 = 5
// Hence the output will be, (1,4) , (2,3).
// Sample Input 2:
// 5 0
// 2 -3 3 3 -2
// Sample Output 2:
// -3 3
// -3 3
// -2 2

// LINK:https://www.naukri.com/code360/problems/pair-sum_697295?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&difficulty%5B%5D=Easy&leftPanelTabValue=PROBLEM
