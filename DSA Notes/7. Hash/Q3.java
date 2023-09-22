import java.util.HashSet;

public class Q3{
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> intersect=new HashSet<>();
        int arr1[]={3,7,9};
        int arr2[]={2,3,7,9,4,9,2,1};
        for(int x:arr1){
            set1.add(x);
        }
        for(int x:arr2){
            if(set1.contains(x)) intersect.add(x);
        }
        System.out.println(intersect);
        
    }
}
