public class Recursion4 {
    public static void main(String[] args) {
        int a=0, b=1, n=10;
        System.out.println(a);
        System.out.println(b);
        printFibo(1,1,n-2);
    }
    public static void printFibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFibo(b, c, n-1);
    }
}
