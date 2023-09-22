// Union of two arrays.
import java.util.HashSet;
public class Q2{
    public static void main(String[] args) {
        HashSet<Integer> union=new HashSet<>();
        int arr1[]={3,7,9};
        int arr2[]={2,3,7,9,4,9,2,1};
        for(int x:arr1){
            union.add(x);
        }
        for(int x:arr2){
            union.add(x);
        }
        System.out.println(union);
        System.out.println("Union array size "+union.size());
    }
}