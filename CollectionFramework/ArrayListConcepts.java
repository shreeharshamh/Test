import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// remove duplicates : 1,21,102,1,73,4,5,4,19,21,73,75,76,102
// remove duplicates : "Ranger", "King", "Mercy", "Ranger","Acronym","King"

public class ArrayListConcepts {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,21,102,1,73,4,5,4,19,21,73,75,76,102));
        List<String> words = new ArrayList<>(Arrays.asList("Ranger", "King", "Mercy", "Ranger","Acronym","King"));

        // Remove duplicates using Java8 stream
        List<Integer> numbersWithoutDuplicates = numbers.stream().distinct().collect(Collectors.toList());
        List<String> wordsWithoutDuplicates = words.stream().distinct().collect(Collectors.toList());
        System.out.println(numbersWithoutDuplicates);
        System.out.println(wordsWithoutDuplicates);

        // Remove duplicates using LinkedHashSet
        Set<Integer> setNumbersWithoutDuplicates = new LinkedHashSet<>(numbers);
        Set<String> setWordsWithoutDuplicates = new LinkedHashSet<>(words);
        System.out.println(setNumbersWithoutDuplicates);
        System.out.println(setWordsWithoutDuplicates);

        List<Integer> num = numbers.stream().forEach(i -> i + 5).collect(Collectors.toList());

        
    }
}