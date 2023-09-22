public class LLDemo {
    public static void main(String[] args) {
        LL list=new LL();
        list.addLast("A");
        list.addLast("B");
        // list.addLast("");
        list.addLast("C");
        list.addLast("D");
        list.deleteFromEnd(3);
        // list.printList();
        // int deleteIndex=4;
        // list.deleteFromEnd(deleteIndex);
        list.printList();
        // System.out.println(list.isPallidrome(list.head));
    }
}
