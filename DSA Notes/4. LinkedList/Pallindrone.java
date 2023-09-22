public class Pallindrone extends LL {
    public static void main(String[] args) {
        LL list1=new LL();
        list1.addFirst("1");
        list1.addLast("2");
        list1.addLast("1");
        Node currNodeList1=list1.head;
        LL list2=new LL();
        while(currNodeList1!=null){
            list2.addLast(currNodeList1.data);
            currNodeList1=currNodeList1.next;
        }
        list2.reverse();
        currNodeList1=list1.head;
        Node currNodeList2=list2.head;
        boolean isPallindrome=false;
        while(currNodeList1!=null){
            if(currNodeList1.data==currNodeList2.data){
                currNodeList1=currNodeList1.next;
                currNodeList2=currNodeList2.next;
                isPallindrome=true;
            }
            else{
                isPallindrome=false;
                break;
            }
        }
        if(isPallindrome){
            System.out.println("List is pallindrome");
        }
        else{
            System.out.println("List is not pallindrome");

        }
    }
}
