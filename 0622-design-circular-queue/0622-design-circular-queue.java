
class MyCircularQueue {
    int front=-1;
    int rear=-1;
    int k;
    int msg[];
    public MyCircularQueue(int k) {
       this.msg=new int[k];
       this.k=k;

    }
    public boolean enQueue(int value) {
        if (front==(rear+1)%k){
            return false;
        }
        else{
            rear=(rear+1)%k;
            msg[rear]=value;
            if (front==-1){
                front=0;
            }
        }
        return true;
    }
    
    public boolean deQueue() {
        if (front==-1){
            return false;
        }
        if (front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%k;
        }
        return true;
    }
    
    public int Front() {
        if (front==-1){
            return -1;
        }
        return msg[front];
    }
    
    public int Rear() {
        if (front==-1){
            return -1;
        }
        return msg[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1){
            return true;
        } 
        return false;
    }
    
    public boolean isFull() {
        if(front==(rear+1)%k){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */