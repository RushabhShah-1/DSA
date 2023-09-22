public class LL {
    Node head;
    private int size;
    LL(){
        head=null;
        size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
    int getLength(){
        return size;
    }
    void addFirst(String s){
        Node newNode=new Node(s);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void addLast(String s){
        Node newNode=new Node(s);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    void deleteFirst(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        head=head.next;
        size--;
    }
    void deleteLast(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    void reverse(){
        if(head==null || head.next==null) return;
        Node prevNode=null;
        Node currNode=head;
        Node nextNode=head.next;
        while(nextNode!=null){
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
            nextNode=nextNode.next;
        }
        currNode.next=prevNode;
        head=currNode;
    }
    void printList(){
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    void deleteFromEnd(int deleteIndex){  //This method deletes node from end.
        Node prevNode=head;
        int prevIndex=1;
        if(deleteIndex>getLength()){
            System.out.println("This index does not exist in the LL");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        if(deleteIndex==getLength()){
            System.out.println("Element found at reverse index "+deleteIndex+" is: "+prevNode.data);
            head=head.next;
            return;
        }
        while(prevIndex!=(getLength()-deleteIndex)){
            prevNode=prevNode.next;
            prevIndex++;
        }
        System.out.println("Element found at reverse index "+deleteIndex+" is: "+prevNode.next.data);
        prevNode.next=prevNode.next.next;
    }
    boolean isPallidrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode=findMiddle(head);
        Node secondHalfStart=findReverse(midNode.next);
        Node firstHalfStart=head;
        while(secondHalfStart!=null){
            if(secondHalfStart.data!=firstHalfStart.data){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
    Node findMiddle(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }
    Node findReverse(Node head){
        Node prevNode=null;
        Node currNode=head;
        Node nextNode=head.next;
        while(currNode.next!=null){
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
            nextNode=nextNode.next;
        }
        currNode.next=prevNode;
        return currNode;
    }
}
