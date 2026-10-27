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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode  currnode=dummy;
        for (int i=1;i<left;i++){
            currnode=currnode.next;
        }
        ListNode leftnode=currnode.next;


        for (int i=1;i<=right-left;i++){
            ListNode nextnode=leftnode.next;

           leftnode.next=nextnode.next;

           nextnode.next=currnode.next;
           currnode.next=nextnode;
            

        }
        return dummy.next;
    }
}