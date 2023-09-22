//Implement two stack in a single array;
import javax.management.RuntimeErrorException;

public class Q2{
    int a[];
    int top1;
    int top2;
    Q2(int size){
        a=new int[size];
        this.top1=-2;
        this.top2=-1;
    }
    
    void push1(int data){ 
        top1=top1+2;
        a[top1]=data;
    } 
    void push2(int data){
        top2=top2+2;
        a[top2]=data;
    } 
    int pop1(){
        if(isEmpty1()){
            throw new RuntimeErrorException(null, "Stack1 is empty");
        }
        int x=a[top1];
        top1=top1-2;
        return x;
    }
    int pop2(){
        if(isEmpty2()){
            throw new RuntimeErrorException(null, "Stack2 is empty");
        }
        int x=a[top2];
        top2=top2-2;
        return x;
    }
    boolean isEmpty1(){
        if(top1==-2){
            return true;
        }
        return false;
    }
    boolean isEmpty2(){
        if(top2==-1){
            return true;
        }
        return false;
    }

    void printArray(){
        int max=Integer.max(top1, top2);
        for(int i=0;i<=max;i++){
            System.out.print(a[i]+" ");
        }
    }
    void printStack1(){
        System.out.println("Stack1:");
        int top=0;
        for(;top<=top1;top=top+2){
            System.out.print(a[top]+" ");
        }
        System.out.println();
    }
    void printStack2(){
        System.out.println("Stack2:");
        int top=1;
        for(;top<=top2;top=top+2){
            System.out.print(a[top]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q2 array=new Q2(50);
        
        array.push1(5);
        array.push1(10);
        array.push1(15);
        array.push1(20);
        array.push1(25);
        array.push1(30);
        array.push2(4);
        array.push2(8);
        array.push2(12);
        array.push2(16);
        array.push2(20);
        array.push2(24);
        System.out.println(array.pop1());
        System.out.println(array.pop1());
        System.out.println(array.pop1());
        System.out.println(array.pop1());

        array.pop2();
        array.printStack1();
        array.printStack2();
    }
}
