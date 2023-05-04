package Set.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * a java program to demonstrate TreeSet constructor for customized sorting
 * Constructor 2 : TreeSet t = new TreeSet(new Comparator c);
 * 
 * Arrange elements in TreeSet in descending order
 */

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(20);
        t.add(15);
        t.add(25);
        System.out.println(t);
    }
}

class MyComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;
        if (I1 > I2) { return -1; }
        else if (I1 < I2) { return +1; }
        else return 0;
    }

}