public class Question extends LL{
    public static void main(String[] args) {
        LL l=new LL();
        l.addLast("A");
        l.addLast("B");
        l.addLast("C");
        l.addLast("D");
        Node deleteNode=l.head.next.next.next;
        deleteNode(deleteNode);
        l.printList();
    }
    public static void deleteNode(Node deleteNode){
        if(deleteNode.next==null) {
            deleteNode=null;
            return;
        }
        Node nextNode=deleteNode.next;
        deleteNode.data=nextNode.data;
        deleteNode.next=nextNode.next;
    }
    public static void deleteNodeN(LL l,Node deleteNode){
        if(l.isEmpty()){
            System.out.println("List is empty");
        }
        if(l.head==deleteNode){
            l.head=l.head.next;
            return;
        }
        Node prevNode=l.head;
        Node currNode=l.head.next;
        while(currNode!=null){
            if(currNode==deleteNode){   
                prevNode.next=currNode.next;
                return;
            }
            prevNode=currNode;
            currNode=currNode.next;
        }
        System.out.println("Node not found"); 
    }
}

