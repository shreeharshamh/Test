import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ArrayListDemo {
    public static void main(String[] args) {
        // creating empty ArrayList object, with initial capacity/default capacity=10
        List<Object> list = new ArrayList<>();
        
        // adding integer elements to array
        for (int i=0; i<=10; i++) {
            list.add(i);
        }
        System.out.println(list);
        
        // adding non-integer elements to array
        list.add("N");
        list.add("Raghavendra");
        System.out.println(list);

        // removing element from array at index 1
        list.remove(1);
        // add new element to index 2
        list.add(2, "Random");
        System.out.println(list.get(2));
    }
}