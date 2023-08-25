//Write method to Insert element at the bottom of the stack
//Write method to reverse a stack also. 
import java.util.Stack;
public class Q1{
    public static void insertAtBottom(int data,Stack<Integer> s){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        insertAtBottom(data, s);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        insertAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(9);
        s.push(5);
        s.push(4);
        s.push(6);
        System.out.println(s);

        reverseStack(s);
        System.out.println(s);
    }
}