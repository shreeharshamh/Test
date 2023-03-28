import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Java program to find Duplicate elements in the given list 
 * using StreamAPI 
 */

public class DuplicateUsingStream1 {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<>();
        companies.add("Meta");
        companies.add("Netflix");
        companies.add("Apple");
        companies.add("Meta");
        companies.add("Google");
        companies.add("Netflix");
        companies.add("Amazon");
        companies.add("Google");

        // 1. Print list of original elements including duplicate
        System.out.println("Original Elements : \n");
        companies.forEach(System.out::println);
        System.out.println("");

        // 2. Get distinct elements into a list
        List<String> distinctCompany = companies.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct companies : \n");
        distinctCompany.forEach(System.out::println);

        // 3. Duplicates from the given list
        Map<String, Integer> map = 
            companies.stream().collect(
                Collectors.toMap(Function.identity(), x -> 1, Math::addExact)
            );
        System.out.println(map);
    }
}