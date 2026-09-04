class Node {
    String val;
    Node next;
    Node prev;

    Node(String val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

class BrowserHistory {
    Node currpage;
    public BrowserHistory(String homepage) {
        currpage=new Node(homepage);
    }
    
    public void visit(String url) {
        Node newnode=new Node(url);
        currpage.next=null;
        currpage.next=newnode;
        newnode.prev=currpage;
        currpage=newnode;
    }
    
    public String back(int steps) {
        while(steps!=0 && currpage.prev!=null){
            currpage=currpage.prev;
            steps--;
        }
        return currpage.val;
        
    }
    
    public String forward(int steps) {
        while(steps!=0 && currpage.next!=null){
            currpage=currpage.next;
            steps--;
        }
        return currpage.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */