package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        for(int i=10; i<=50; i++) {
            if(i%2==0) { t.add(i); }
        }
        
        System.out.println("Before customized sorting : ");
        System.out.println(t);

        TreeSet<Integer> t1 = new TreeSet<>(new CustomSorting());
        for(int i=10; i<=50; i++) {
            if(i%2==0) { t1.add(i); }
        }
        System.out.println("After customized sorting : ");
        System.out.println(t1);
    }
}

class CustomSorting implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;
        // return I2.compareTo(I1);
        // return -1;
        if (I1 > I2) { return -1; }
        else if (I1 < I2) { return +1; }
        else return 0;
    }
    
}