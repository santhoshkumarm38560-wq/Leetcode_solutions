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
        ListNode prevnode=null;
        ListNode currnode=head;
        while(currnode!=null){
            ListNode nextnode=currnode.next;
            currnode.next=prevnode;
            
            prevnode=currnode;
            currnode=nextnode;
        }
        return prevnode;
    }
    public int getDecimalValue(ListNode head) {
        ListNode newhead=reverse(head);
        ListNode currnode=newhead;
        int decimal=0;
        int power=0;
        while(currnode!=null){
            int digit=currnode.val%10;
            decimal=decimal+digit*(int)Math.pow(2,power);
            currnode=currnode.next;
            power++;
        }
        return decimal;
    }
}