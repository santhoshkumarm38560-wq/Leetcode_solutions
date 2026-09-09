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
    public int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;

        }
        return a;
    }
    public ListNode createlist(ListNode head){
        ListNode currnode=head;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(currnode!=null && currnode.next!=null){
            int par=gcd(currnode.val,currnode.next.val);
            ListNode newnode=new ListNode(par);
            temp.next=newnode;
            temp=newnode;
            currnode=currnode.next;
        }
        return dummy.next; 
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       ListNode newhead=createlist(head);
       ListNode currnode=head;
       ListNode nextnode=currnode.next;
       ListNode temp=newhead;
    

       while(currnode!=null && temp!=null){
            ListNode tempnext=temp.next;
            currnode.next=temp;
            temp.next=nextnode;
            currnode=nextnode;
            temp=tempnext;
            if (currnode!=null){
                nextnode=currnode.next;
            }
            if (temp!=null){
                tempnext=temp.next;
            }
        }
        return head;

    }
}