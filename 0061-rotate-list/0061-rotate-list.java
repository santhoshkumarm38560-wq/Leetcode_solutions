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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null){
            return null;
        }
        ListNode temp=head;
        ListNode currnode=head;
        int len=1;
        while(currnode.next!=null){
            currnode=currnode.next;
            len++;
        }
        if (k%len==0){
            return head;
        }
        k=k%len;
        currnode.next=head;
        for (int i=1;i<len-k;i++){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}