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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode currnode=head;
        while(currnode!=null){
            ListNode nextnode=currnode.next;
            currnode.next=prev;

            prev=currnode;
            currnode=nextnode;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode newhead=reverse(head);
        ListNode currnode=newhead;
        while(currnode.next!=null){
            ListNode nextnode=currnode.next;
            if (nextnode.val<currnode.val){
                currnode.next=currnode.next.next;
            }
            else{
                currnode=nextnode;
            }
        }
        return reverse(newhead);
    }
}