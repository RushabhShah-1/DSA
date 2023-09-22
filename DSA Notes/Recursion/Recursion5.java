public class Recursion5 {
    public static void main(String[] args) {
        System.out.println(calpow2(5,4));
    }
    public static int calpow1(int x,int n){// stack length=n
        if(x==0) return 0;
        if(n==1) return x;
        int pow=x*calpow1(x, n-1);
        return pow;
    }
    public static int calpow2(int x,int n){ //stack length=log(n)
        if(x==0) return 0;
        if(n==1) return x;
        if(n%2==0){
            return calpow2(x, n/2)*calpow2(x, n/2);
        }
        else{
            return calpow2(x, n/2)*calpow2(x, n/2)*calpow2(x, 1);
        }
    }
}
