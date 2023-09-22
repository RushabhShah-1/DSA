//Factorial of a number n
public class Recursion3 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
    }
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact=1;
        fact=n*fact(n-1);
        return fact;
    }
}
