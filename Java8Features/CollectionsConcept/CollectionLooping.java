import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class CollectionLooping {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Shantanu","Bheeshma","Dronacharya","Vidhura"));
        
        // 1. Print names using Java8 forEach(new Consumer<T>()) { }); method
        System.out.println("1. Print names using Java8 forEach(new Consumer<T>()) { }); method");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();

        // 2. Print names using forEach() method
        System.out.println("2. Print names using forEach() method");
        names.forEach(name -> {
            System.out.println(name);
        });
        System.out.println();

        // 3. Print names using forEach()
        System.out.println("3. Print names using forEach()");
        names.forEach(name -> System.out.println(name));
        System.out.println();

        // 4. Print names using forEach()
        System.out.println("4. Print names using forEach()");
        names.forEach(System.out::println);
        System.out.println();

        // 5. Print names using stream()
        System.out.println("5. Print names using stream()");
        names.stream().forEach(System.out::println);
        System.out.println();

        // 6. Print names using Stream()
        System.out.println("6. Print names using Stream()");
        names.stream().forEach(name -> System.out.println(name));
        System.out.println();

        // 7. Print names using stream()
        System.out.println("7. Print names using Stream()");
        List<String> list = names.stream().collect(Collectors.toList());
        System.out.println(list);
        System.out.println();


        // 8. Print names using Advanced for loop
        System.out.println("8. Print names using Advanced for loop");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        // 9. Print names using for loop
        System.out.println("9. Print names using for loop");
        for (int i=0; i<names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();

        // 10. Print names using iterator()
        System.out.println("10. Print names using iterator()");
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();

    }
}