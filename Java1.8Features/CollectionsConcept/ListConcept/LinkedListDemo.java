import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0; i<=10; i++) {
            ll.add(i);
        }
        System.out.println(ll);
        ll.remove(1);
        ll.add(1,99);
        ll.add(9, 100);
        System.out.println(ll);
        TreeSet<Integer> t1 = new TreeSet<>(ll);
        System.out.println(t1);
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());
        for(int i=0; i<=10; i++) {
            t.add(i);
        }
        System.out.println(t);
    }
}
class MyComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        return -I1.compareTo(I2);

    }
}