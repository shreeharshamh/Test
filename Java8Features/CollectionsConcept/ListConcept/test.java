import java.util.LinkedList;
import java.util.TreeSet;

public class test {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0; i<=10; i++) {
            ll.add(i);
        }
        ll.remove(1);
        ll.add(1, 111);
        ll.add(3, 333);
        System.out.println(ll);
        TreeSet<Integer> ts = new TreeSet<>(ll);
        System.out.println(ts);
    }
    
}
