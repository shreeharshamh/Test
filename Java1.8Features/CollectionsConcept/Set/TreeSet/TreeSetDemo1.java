package Set.TreeSet;

import java.util.TreeSet;

/*
 * a java program to demonstrate TreeSet constructors
 * Constructor 1 : TreeSet t = new TreeSet();
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {
        // create an instance of TreeSet and add elements to it
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(5);
        t.add(0);
        t.add(20);
        t.add(15);
        System.out.println(t);      // [0,5,10,15,20]   Default Natural Sorting Order
    }
}
