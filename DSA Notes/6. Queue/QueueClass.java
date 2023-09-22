public class QueueClass{
    int Q[];
    int size; 
    int rear; //There is no need of front. Bcz front will be always a[0]
    int totalElements;
    QueueClass(){
        Q=new int[5];
        size=Q.length;
        rear=-1;
        totalElements=0;
    }
    int gettoalElements(){
        return totalElements;
    }
    boolean isEmpty(){
        return rear==-1;
    }
    //Enqueue operation
    void add(int n){
        if(rear==size-1){
            System.out.println("Sorry can't insert "+n+ ". Queue is full");
            return;
        }
        ++rear;
        Q[rear]=n;
        totalElements++;
    }
    //Dequeue operation
    int remove(){
        if(isEmpty() ){
            System.out.println("Queue is empty");
            return -1;
        }
        int front=Q[0];
        for(int i=0;i<rear;i++){
            Q[i]=Q[i+1];
        }
        rear--;
        totalElements--;
        return front;
    }
    int peek(){
        if(isEmpty() ){
            System.out.println("Queue is empty");
            return -1;
        }
        return Q[0];
    }
    void printQueue(){
        if(rear==-1) System.out.println("No value to print.Queue is empty.");
        for(int i=0;i<=rear;i++){
            System.out.print(Q[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueClass q=new QueueClass();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(8);
        q.remove();
        q.remove();
        q.remove();

        q.printQueue();
    }
}