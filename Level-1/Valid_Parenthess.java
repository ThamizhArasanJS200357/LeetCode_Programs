class Solution {
    public boolean isValid(String s) {
        int t = s.length();
        char ts[] = s.toCharArray();
        List<Character> st = new ArrayList<>();
        int js = 0;
        
        for (char i : ts) {
            if (i == '(' || i == '{' || i == '[') {
                st.add(i);
            } else if (i == ')' || i == '}' || i == ']') {
                if (!st.isEmpty() && 
                    ((i == ')' && st.get(st.size() - 1) == '(') ||
                     (i == '}' && st.get(st.size() - 1) == '{') ||
                     (i == ']' && st.get(st.size() - 1) == '['))) {
                    st.remove(st.size() - 1);
                } else {
                    js = 1;
                    break;
                }
            }
        }
        
        if (js == 0 && st.isEmpty()) {
            return true;
        }
        return false;
    }
}



// Example 1:

// Input: s = "()"

// Output: true

// Example 2:

// Input: s = "()[]{}"

// Output: true

// Example 3:

// Input: s = "(]"

// Output: false

// Example 4:

// Input: s = "([])"

// Output: true


//LINK:https://leetcode.com/problems/valid-parentheses/description/
