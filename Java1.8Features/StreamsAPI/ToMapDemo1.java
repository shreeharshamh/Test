import java.util.*;
import java.util.stream.Collectors;

/*
 * Java program to demonstrate usage of toMap() in 
 * StreamAPI
 */
public class ToMapDemo1 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Rajiv");
        names.add("Prashant");
        names.add("Rajiv");
        names.add("Prashant");
        names.add("Sudhir");
        names.add("Mahesh");

        Set<String> name = names
        .stream()
        .collect(
            Collectors.toSet()
        );

        Map<String, Integer> map = 
            name.stream()
            .collect(
                Collectors.toMap(x -> x, y -> 100)
            );
        System.out.println(map);
    }
}