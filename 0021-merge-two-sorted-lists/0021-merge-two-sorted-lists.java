/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dummy=new ListNode(-1);
        ListNode currnode=dummy;
        while(t1!=null && t2!=null){
            if (t1.val<t2.val){
                currnode.next=t1;
                currnode=t1;
                t1=t1.next;

            }
            else{
                currnode.next=t2;
                currnode=t2;
                t2=t2.next;
                
            }

        }
        if (t1!=null){
            currnode.next=t1;
        }
        if (t2!=null){
            currnode.next=t2;
        }
        return dummy.next;
    
        
    }
}