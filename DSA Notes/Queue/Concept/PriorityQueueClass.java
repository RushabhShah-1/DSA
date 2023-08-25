public class PriorityQueueClass {
    int pqueue[];
    int currsize;
    int front;
    int rear;
    PriorityQueueClass(int currsize){
        pqueue=new int[currsize];
        currsize=0;
        front=rear=-1;
    }
    boolean isEmpty(){
        return (front==-1 && rear==-1);
    }
    void add(int n){
        if(isEmpty()){
            front=rear=0;
            pqueue[rear]=n;
            currsize++;
            return;
        }
        if(currsize==1){
            if(pqueue[rear]>n){
                pqueue[rear+1]=pqueue[rear];
                pqueue[rear]=n;
            }
            else{
                pqueue[rear+1]=n;
            }
            rear++;
            currsize++;
            return;
        }
        if(currsize+1<=pqueue.length){
            for(int i=rear;i>=0;i--){
                if(pqueue[i]>n){
                    pqueue[i+1]=pqueue[i];
                }
                else{
                    pqueue[i+1]=n;
                    currsize++;
                    rear++;
                    return;
                }
            }
        }
        else System.out.println("Can't add "+n+" .Queue is full");
    }
    void printQueue(){
        System.out.print("Queue:");
        for (int x : pqueue) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        PriorityQueueClass q1=new PriorityQueueClass(10);
        q1.add(15);
        q1.add(2);
        q1.add(10);
        q1.add(30);
        q1.add(10);
        q1.add(50);
        q1.printQueue();
    }
}
