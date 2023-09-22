public class StackUserdefined {
    Node head;
    // Stack(){
    //     head=null;
    // }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    boolean isEmpty(){
        return head==null;
    }
    void push(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
    void printAll(){
        while(!isEmpty()){
            System.out.println(peek());
            pop();
        }
    }
    public static void main(String[] args) {
        StackUserdefined s=new StackUserdefined();
        s.push(7);
        s.push(8);
        s.push(694);
        s.push(10);
        s.printAll();
    }
}
