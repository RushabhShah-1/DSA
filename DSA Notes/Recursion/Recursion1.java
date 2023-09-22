public class Recursion1{
    public static void main(String[] args) {
        printrev(1);
    }
    public static void printrev(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printrev(n+1);
    }
}