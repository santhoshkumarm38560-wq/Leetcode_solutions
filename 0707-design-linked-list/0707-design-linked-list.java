class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {

        if (index < 0) {
            return -1;
        }

        ListNode currnode = head;
        int count = 0;

        while (currnode != null) {

            if (count == index) {
                return currnode.val;
            }

            currnode = currnode.next;
            count++;
        }

        return -1;
    }

    public void addAtHead(int val) {

        ListNode newhead = new ListNode(val);

        newhead.next = head;
        head = newhead;
    }

    public void addAtTail(int val) {

        ListNode newnode = new ListNode(val);

        if (head == null) {
            head = newnode;
            return;
        }

        ListNode currnode = head;

        while (currnode.next != null) {
            currnode = currnode.next;
        }

        currnode.next = newnode;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        ListNode currnode = head;
        int count = 0;

        while (currnode != null && count < index - 1) {
            currnode = currnode.next;
            count++;
        }

        if (currnode == null) {
            return;
        }

        ListNode newnode = new ListNode(val);

        newnode.next = currnode.next;
        currnode.next = newnode;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        ListNode currnode = head;
        int count = 0;

        while (currnode.next != null && count < index - 1) {
            currnode = currnode.next;
            count++;
        }

        if (currnode.next == null) {
            return;
        }

        currnode.next = currnode.next.next;
    }
}