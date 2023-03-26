import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Java program to demonstration addition of numbers to each element in collection
 * using StreamAPI map() method
 */
public class MapDemo1 {
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

         List<Integer> numbers = arrayList.stream().map(i->i+5).collect(Collectors.toList());
         System.out.println(numbers);
    }    
}
