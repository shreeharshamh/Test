import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Pavan");
        names.add("Kaleenbhaiya");
        names.add("Arun");
        names.add("Harsha");

        ListIterator<String> itr = names.listIterator();
        while(itr.hasNext()) {
            String str = (String) itr.next();
            System.out.println(str);
        }
    }
}
