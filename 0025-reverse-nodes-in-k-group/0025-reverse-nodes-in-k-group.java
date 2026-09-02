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
    public ListNode findkth(ListNode head,int k){
        ListNode currnode=head;
        int count=0;
        while(currnode!=null){
            count++;
            if (count==k){
                break;
            }
            currnode=currnode.next;
        }
        return currnode;

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head==null){
            return null;
        }
        ListNode currnode=head;
        ListNode prevnode=null;
        while(currnode!=null){
            ListNode kthnode=findkth(currnode,k);
            if (kthnode==null){
                if(prevnode!=null){
                    prevnode.next=currnode;
                    break;
                }

            }
            ListNode nextnode=kthnode.next;
            kthnode.next=null;
            reverse(currnode);
            if (currnode==head){
                head=kthnode;
            }
            else{
                prevnode.next=kthnode;
            }
            prevnode=currnode;
            currnode=nextnode;

        }
        return head;
    }
}