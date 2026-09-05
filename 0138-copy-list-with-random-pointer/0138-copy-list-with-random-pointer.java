/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head==null){
            return null;
        }
        Node currnode=head;
        while(currnode!=null){
            Node newnode=new Node(currnode.val);
            newnode.next=currnode.next;
            currnode.next=newnode;
            currnode=currnode.next.next;
        }
        currnode=head;
        while(currnode!=null){
            Node copynode=currnode.next;
            if (currnode.random!=null){
                copynode.random=currnode.random.next;
            }
            currnode=copynode.next;
        }
        currnode=head;
        Node dummynode=new Node(-1);
        Node curr=dummynode;
        while(currnode!=null){
            Node copynode=currnode.next;
            curr.next=copynode;
            curr=copynode;
            currnode.next=copynode.next;
            currnode=currnode.next;
        }  
        return dummynode.next; 
    }
}