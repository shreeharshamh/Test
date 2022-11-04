import java.util.*;
import java.util.stream.Collectors;

// remove duplicates : 1,21,102,1,73,4,5,4,19,21,73,75,76,102
// remove duplicates : "Ranger", "King", "Mercy", "Ranger","Acronym","King"

public class ArrayListLooping {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>(Arrays.asList("Ranger", "King", "Mercy", "Ranger","Acronym","King"));
        
        // 1. Remove duplicate using stream()
        System.out.println("1. Remove duplicate using stream()");
        List<String> namesWithoutDuplicate = names.stream().distinct().collect(Collectors.toList());
        System.out.println(namesWithoutDuplicate);
        System.out.println();

        // 2. Print names using stream()
        System.out.println("2. Print names using stream()");
        names.stream().forEach(name -> System.out.println(name));
        System.out.println();

        // 3. Remove duplicates using LinkedHashSet
        System.out.println("3. Remove duplicates using LinkedHashSet");
        Set<String> removeDuplicates = new LinkedHashSet<>(names);
        System.out.println(removeDuplicates);
    }
}
