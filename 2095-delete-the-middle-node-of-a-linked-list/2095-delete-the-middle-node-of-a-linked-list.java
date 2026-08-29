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
    public ListNode getmiddle(ListNode head){
        if (head==null || head.next==null){
            return head;
        }
        ListNode hare=head;
        ListNode turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        int size=0;
        ListNode currnode=head;
        while(currnode!=null){
            currnode=currnode.next;
            size++;
        }
        if (size%2!=0){
            return turtle;
        }
        return turtle.next;
    }
    public ListNode deleteMiddle(ListNode head) {
        

            if (head == null || head.next == null) {
                return null;
            }

            ListNode middle = getmiddle(head);

            ListNode prev = head;
            ListNode curr = head.next;

            while (curr != middle) {
                prev = prev.next;
                curr = curr.next;
            }

            prev.next = middle.next;

            return head;
        }
}