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
        if (head==null || head.next==null){
            return head;
        }
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=reverse(l1);
        ListNode temp2=reverse(l2);
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int carry=0;
        while(temp1!=null || temp2!=null){
            int sum=carry;
            if (temp1!=null){
                sum=sum+temp1.val;
            }
            if (temp2!=null){
                sum=sum+temp2.val;
            }
            ListNode newnode=new ListNode(sum%10);
            curr.next=newnode;
            curr=curr.next;
            carry=sum/10;

            if (temp1!=null){
                temp1=temp1.next;
            }
            if (temp2!=null){
                temp2=temp2.next;
            }
        }
        if (carry!=0){
            curr.next=new ListNode(carry);
        }
        return reverse(dummy.next);
  
    }
}