
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Java program to print even numbers using filter from streams api
 * 
 */
public class FilterDemo1 {
    private static List<Integer> evenNumbers;

    public static void main(String[] args) {
        // create an instance of array list and add elements to it
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);
        arrayList.add(30);
        arrayList.add(35);
        System.out.println(arrayList);

        evenNumbers = arrayList.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}