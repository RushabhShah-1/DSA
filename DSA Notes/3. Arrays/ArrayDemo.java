public class ArrayDemo {
    public static void main(String[] args) {
        Array a=new Array(1);
        a.insert(20);
        a.insert(80);
        a.insert(30);
        a.insert(50);
        System.out.println(a.getIndex());
        // a.insertAt(0, 900);
        // a.intersect(new int[]{10,20,30,60,20,40});
        a.reverse();
        a.print();
    }
}
