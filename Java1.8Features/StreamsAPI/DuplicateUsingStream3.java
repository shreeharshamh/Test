import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateUsingStream3 {
    public static void main(String[] args) {
        List<String> stars = new ArrayList<>();
        stars.add("Sirius");
        stars.add("Sirius");
        stars.add("Canopus");
        stars.add("Arcturus");
        stars.add("Arcturus");
        stars.add("Canopus");
        stars.add("Procyon");
        stars.add("Achernar");
        stars.add("Pollux");
        stars.add("Procyon");
        stars.add("Pollux");
        stars.add("Acrux");

        System.out.println("Original list of stars :\n");
        stars.forEach(System.out::println);
        System.out.println("");
        System.out.println("Stars count :\n ");
        Map<String, Integer> duplicateCount = 
            stars
            .stream()
            .collect(
                Collectors.toMap(Function.identity(), star -> 1, Math::addExact)
            );
        
        duplicateCount
            .forEach((key,value) ->
                System.out.println("key : " + key + "\t\t\t duplicate count : " + value)
            );
    }
}
