import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Object> h = new HashSet<>();
        h.add("Y");
        h.add("A");
        h.add("B");
        h.add("X");
        h.add("C");
        h.add("Z");
        h.add(null);
        //duplicates are not allowed        
        System.out.println("Adding element Z to HashSet : " + h.add("Z"));
        // ascending order arrangement
        System.out.println(h);
    }
}
