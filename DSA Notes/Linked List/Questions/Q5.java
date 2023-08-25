/* 
 * Given a singly linked list, write a function to swap elements pairwise. 
 * Example: Input : 1->2->3->4->5->6->NULL 
            Output : 2->1->4->3->6->5->NULL

            Input : 1->2->3->4->5->NULL 
            Output : 2->1->4->3->5->NULL

            Input : 1->NULL 
            Output : 1->NULL 
 */
public class Q5 extends LL{
    public static void pairwiseSwap(LL l) {
    Node temp = l.head;
         while (temp != null && temp.next != null) {
 
            /* Swap the data */
            String k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
}

    public static void main(String[] args) {
        LL l=new LL();
        l.addLast("1");
        l.addLast("2");
        l.addLast("3");
        l.addLast("4");
        // l.addLast("E");
        // l.addLast("F");
        // l.addLast("G");
        l.printList();
        pairwiseSwap(l);
        l.printList();
    }
}
