class Solution {
    static int isGoodorBad(String S) {
        // code here
        int v=0,c=0;
        for(int i=0;i<S.length();i++) {
            if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u') {
                v++; c=0;
                if(v>5) { return 0;} 
            }
            else if(S.charAt(i)=='?') {
                v++; c++; 
                if(v>5 || c>3) { return 0; }
            }
            else {
                v=0; c++;
                if(c>3) { return 0; }
            }
        }
        if(v>5 || c>3) { return 0; }
        else  { return 1; }
    }
}

// Example 1:

// Input:
// S = aeioup??
// Output:
// 1
// Explanation: The String doesn't contain more
// than 3 consonants or more than 5 vowels together.
// So, it's a GOOD string.
// Example 2:

// Input:
// S = bcdaeiou??
// Output:
// 0
// Explanation: The String contains the
// Substring "aeiou??" which counts as 7
// vowels together. So, it's a BAD string.

//LINK:https://www.geeksforgeeks.org/problems/good-or-bad-string1417/1

