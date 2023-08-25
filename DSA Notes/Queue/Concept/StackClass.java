public class StackClass {
    Node head;
    int size=0;
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
        size++;
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
        size--;
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
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        // System.out.println();
    }
    
    public static void main(String[] args) {
        StackClass s=new StackClass();
        s.push(7);
        s.push(8);
        s.push(69);
        s.push(10);
        s.printAll();
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.peek());
        
    }
}