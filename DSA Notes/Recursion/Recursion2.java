//Sum of first n natural numbers.
public class Recursion2 {
    public static void main(String[] args) {
        int n=5;
        int sum=sumrec(n);
        System.out.println(sum);
    }
    public static int sumrec(int n){
        if(n==1){
            return 1;
        }
        int sum=0;
        sum=n+sumrec(n-1);
        return sum;
    }
}
