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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
       
        if (head==null){
            return null;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode currnode=dummy;
        while(currnode.next!=null){
            if (set.contains(currnode.next.val)){
                currnode.next=currnode.next.next;
            }
            else{
                currnode=currnode.next;
            }
        }
        return dummy.next;

    }
}
