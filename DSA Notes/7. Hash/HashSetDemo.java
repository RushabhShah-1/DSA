import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(15);
        set.add(20);
        set.add(5); // This 5 is not added
        System.out.println(set);
        System.out.println(set.contains(10));
        System.out.println(set.contains(25));
        set.remove(10);
        Iterator<Integer> i=set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}