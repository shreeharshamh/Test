import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
 * Java program to count total duplicates in given list
 * using StreamAPI
 */

public class DuplicateUsingStream2 {
    public static void main(String[] args) {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("MTB");
        vehicles.add("Honda");
        vehicles.add("Yamaha");
        vehicles.add("Hero");
        vehicles.add("Suzuki");
        vehicles.add("MTB");
        vehicles.add("Hero");
        vehicles.add("Enfield");
        vehicles.add("Honda");
        vehicles.add("Enfield");
        vehicles.add("Honda");

        System.out.println("Without duplicates : \n");
        vehicles.forEach(System.out::println);

        Map<String, Integer> duplicateVehiclesCount =
                vehicles
                .stream()
                .collect(
                    Collectors.toMap(Function.identity(), vehicle -> 1, Math::addExact)
                );
        duplicateVehiclesCount
                .forEach(null);
    }
}