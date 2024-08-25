class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;


        ListNode cur=null;
        ListNode res=null;


        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                if(cur==null){
                    cur=list1;
                    res=cur;
                }
                else{
                    cur.next=list1;
                    cur=cur.next;
                }
                list1=list1.next;
            }
            else{
                if(cur==null){
                    cur=list2;
                    res=cur;
                }
                else{
                    cur.next=list2;
                    cur=cur.next;
                }
                list2=list2.next;
            }
        }
        while(list1!=null){
            cur.next=list1;
            cur=cur.next;
            list1=list1.next;
        }
        while(list2!=null){
            cur.next=list2;
            cur=cur.next;
            list2=list2.next;
        }
        return res;
    }
}

// Example 1:

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]
// Example 2:

// Input: list1 = [], list2 = []
// Output: []
// Example 3:

// Input: list1 = [], list2 = [0]
// Output: [0]

// LINK:https://leetcode.com/problems/merge-two-sorted-lists/description/