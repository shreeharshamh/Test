import java.util.Iterator;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=10; i++) {
            list.add(i);
        }
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            Integer I = (Integer) itr.next();
            if(I%2 == 0) {
                System.out.println(I);
            } else itr.remove();
        }
        System.out.println(list);

    }
}
