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
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode currnode=head;
        while(currnode!=null && currnode.next!=null){
            ListNode nextnode=currnode.next;
            while(nextnode!=null && currnode.val==nextnode.val){
                nextnode=nextnode.next;
            }
            currnode.next=nextnode;
            currnode=currnode.next;
        }
        return head; 
    }
}