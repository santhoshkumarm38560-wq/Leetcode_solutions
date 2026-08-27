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
    public ListNode removeElements(ListNode head, int val) {
        if (head==null){
            return null;

        }
        while (head!=null && head.val==val){
            head=head.next;
              
        }
        if (head==null){
            return null;
        }
    
       
        ListNode currnode=head;
        while(currnode.next!=null){
            if (currnode.next.val==val){
                currnode.next=currnode.next.next;
            }else{
                currnode=currnode.next;

            }
            
        }
        
        return head;



        
    }
}