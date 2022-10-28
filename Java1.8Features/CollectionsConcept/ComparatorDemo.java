// Java program, to reverse the objects in TreeSet, using Comparator

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        // arrange numbers in reverse order 
        TreeSet<Object> t = new TreeSet<>(new MyComparator1());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        t.add(1);
        t.add(25);
        System.out.println(t);
    }
}

// using if conditional return
class MyComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        if(I1 < I2) return +1;
        else if(I1 > I2) return -1;
        else return 0;
    }
}
// using obj1.compareTo(obj2) method
class MyComparator1 implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Integer I1 = (Integer) obj1;
        Integer I2 = (Integer) obj2;
        return -I1.compareTo(I2);
    }
}