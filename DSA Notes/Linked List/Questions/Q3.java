// Rotate linked list by kth nodes in counter clockwise
/* Input: linked list = 10->20->30->40->50->60, k = 4
Output: 50->60->10->20->30->40. 
Explanation: k is smaller than the count of nodes in a linked list so (k+1 )th node i.e. 50 becomes the head node and 60’s next points to 10

Input: linked list = 30->40->50->60, k = 2
Output: 50->60->30->40. */

import java.util.Scanner;

public class Q3 extends LL{

    public static void rotate(LL l){
        if (l.head == null || l.head.next == null) return;
        Node currNode=l.head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=l.head;
        l.head=l.head.next;
        currNode.next.next=null;
        
    }
    public static void main(String[] args) {
        LL l=new LL();
        l.addLast("A");
        l.addLast("B");
        l.addLast("C");
        l.addLast("D");
        l.printList();
        System.out.println("Enter value of k by which you want rotate Linked list");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=1;i<=k;i++){
            rotate(l);
        }
        l.printList();
        sc.close();
    }
}
