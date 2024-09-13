import java.util.ArrayList ;

public class Linear_Search {
    static int linearSearch(ArrayList<Integer> a, int x) {
      // Write your code here.
      for(int i=0;i<a.size();i++){
        if(a.get(i)==x){
          return i;
        }
      }
      return -1;
    }
    
}




// Sample Input 1 :
// 2
// 6 1
// 2 6 2 8 4 5
// 1 1 
// 1 
// Sample Output 1 :
// -1
//  0
// Explanation Of Sample Output 1 :
// Since there is no instance of 1 in the input array we return -1.
// In the second test case, the only occurrence of 1 is 0.
// Sample Input 2 :
// 1
// 5 3
// 5 1 3 4 3
// Sample Output 2 :
// 2



// LINK:https://www.naukri.com/code360/problems/linear-search_2109212?interviewProblemRedirection=true&search=linear&leftPanelTabValue=PROBLEM