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
        ListNode turtle=head;
        ListNode hare=head.next;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    public ListNode merge(ListNode head1,ListNode head2){
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode dummy=new ListNode(-1);
        ListNode currnode=dummy;
        while(temp1!=null && temp2!=null){
            if (temp1.val<=temp2.val){
                currnode.next=temp1;
                currnode=temp1;
                temp1=temp1.next;
            }
            else{
                currnode.next=temp2;
                currnode=temp2;
                temp2=temp2.next;
            }
        }
        if (temp1!=null){
            currnode.next=temp1;
        }
        if (temp2!=null){
            currnode.next=temp2;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode starthead=head;
        ListNode middlenode=getmiddle(head);
        ListNode midstart=middlenode.next;
        middlenode.next=null;
        starthead=sortList(starthead);
        midstart=sortList(midstart);
        return merge(starthead,midstart);
    }
}