// Implement queue using two stacks.
public class Q1 extends StackClass{
    static StackClass s1=new StackClass();
    static StackClass s2=new StackClass();
    static void add(int n){
        s1.push(n);
    }
    static int remove(){
        if(s1.isEmpty() && s2.isEmpty()) throw new IllegalArgumentException("Queue is empty");
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    static int peek1(){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        return s2.peek();
    }
    static void print(){
        if(s1.isEmpty() && s2.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        peek1();
        s2.printAll();
        if(!s1.isEmpty()) {
            peek1();
            s2.printAll();
        }
        System.out.println();
    }
    
    
    
    public static void main(String[] args) {
        add(3);
        add(5);
        add(8);
        add(12);
        print();
        add(17);
        add(15);
        print();

    }
}