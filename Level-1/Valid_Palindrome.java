// Valid_Palindrome


class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char t[]=s.toCharArray();
        List<Character>st=new ArrayList<>();
        List<Character>ts=new ArrayList<>();
        for(char i:t){
            if(Character.isLetterOrDigit(i)){
                st.add(i);
                ts.add(i);
            }
        }
        Collections.reverse(ts);
        if((st.equals(ts))||st.size()==0){
            return true;
        }
        return false;
        
    }
}

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.


// LINK:https://leetcode.com/problems/valid-palindrome/
