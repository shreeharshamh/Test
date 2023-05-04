package Set;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<Object> h = new HashSet<>();
        h.add("A");
        h.add("R");
        h.add("J");
        h.add("U");
        h.add("N");
        System.out.println(h.add("A"));         // false : .add() method returns boolean; duplicates not allowed
        h.add(10);
        h.add(null);    
        System.out.println(h.add(null));        // false : null insertion possible only once
        System.out.println(h);
    }
    
}
