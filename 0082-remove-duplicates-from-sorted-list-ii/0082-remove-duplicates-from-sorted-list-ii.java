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
        if (head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        ListNode currnode=dummy;
        currnode.next=head;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            ListNode nextnode=temp.next;
             if (temp.val!=temp.next.val){
                currnode=temp;
                temp=temp.next;
            }
            else{
                while(nextnode!=null && nextnode.val==temp.val){
                    nextnode=nextnode.next;
               
                }
                currnode.next=nextnode;
                temp=nextnode;
            }
           
        }
        return dummy.next;

    }
}