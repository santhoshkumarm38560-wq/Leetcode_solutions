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
    public ListNode find2node(ListNode head){
        ListNode currnode=head;
        int pos=1;
        while(currnode!=null){
            if (pos==2){
                break;
            }
            currnode=currnode.next;
            pos++;
        }
        return currnode;
    }
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode currnode=head;
        ListNode second=find2node(head);
        ListNode nextnode=second.next;
        second.next=currnode;
        currnode.next=nextnode;
        ListNode newhead=swapPairs(nextnode);
        currnode.next=newhead;
        return second;
    }
}