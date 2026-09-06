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
        if(head==null){
            return null;
        }
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
    public ListNode doubleIt(ListNode head) {
        ListNode newhead=reverse(head);
        ListNode currnode=newhead;
        int sum;
        int carry=0;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(currnode!=null){
            sum=carry;
            if (currnode!=null){
                sum=sum+currnode.val*2;
            }
            ListNode newnode=new ListNode(sum%10);
            temp.next=newnode;
            temp=newnode;
            carry=sum/10;

            if (currnode!=null){
                currnode=currnode.next;
            }

        }
        if (carry!=0){
            temp.next=new ListNode(carry);
        }
        return reverse(dummy.next);
    }
}