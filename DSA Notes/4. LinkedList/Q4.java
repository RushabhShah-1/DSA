/* Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes 
then delete next N nodes, continue the same till end of the linked list. 
Example:
    Input:
    M = 2, N = 2
    Linked List: 1->2->3->4->5->6->7->8
    Output:
    Linked List: 1->2->5->6 */

public class Q4 extends LL{
    public static void main(String[] args) {
        LL l=new LL();
        l.addLast("A");
        l.addLast("B");
        l.addLast("C");
        l.addLast("D");
        l.addLast("E");
        l.addLast("F");
        l.addLast("G");

        int m=2;
        int n=3;
        Node currNode=l.head;
        while(currNode.next!=null){
            
        }
        for(int i=1;i<m;i++){
            currNode=currNode.next;
        }
        Node nextNode=currNode;
        for(int i=0;i<=n;i++){
            nextNode=nextNode.next;
        }
        currNode.next=nextNode;
        l.printList();
    }
    public static void retainMDeleteN(LL l,int m,int n,Node currNode){
        

    }
}
