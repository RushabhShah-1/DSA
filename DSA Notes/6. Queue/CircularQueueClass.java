public class CircularQueueClass {
    int Q[];
    int size;
    int front;
    int rear;
    int totalElements;
    CircularQueueClass(int size){
        Q=new int[size];
        this.size=size;
        front=-1;
        rear=-1;
        totalElements=0;
    }
    boolean isEmpty(){
        return (front==-1 && rear==-1);
    }
    boolean isFull(){
        return (rear+1)%size==front;
    }
    void add(int n){
        if(isFull()){
            System.out.println("Can't add "+n+". Queue is full");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        Q[rear]=n;
    }
    int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int result=Q[front];
        if(front==rear) front=rear=-1;
        else front=(front+1)%size;
        return result;
    }
    int peek(){
       if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } 
        return Q[front];
    }
    void printQueue(){
        if(isEmpty()){
            System.out.print("Nothing to print as queue is empty.");
            return;
        }
        int i=front;
        while (true) {
            System.out.print(Q[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % size;
        }
    }
    public static void main(String[] args) {
        CircularQueueClass q1=new CircularQueueClass(5);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.remove();
        q1.add(6);
        q1.remove();
        q1.add(7);
        q1.printQueue();
    }
}
