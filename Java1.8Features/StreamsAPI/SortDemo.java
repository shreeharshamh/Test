import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
         arrayList.add(45);
         arrayList.add(10);
         arrayList.add(155);
         arrayList.add(20);
         arrayList.add(255);
         arrayList.add(30);
         arrayList.add(357);
         System.out.println(arrayList);
         List<Integer> sortednNumbers = arrayList.stream().sorted().collect(Collectors.toList());
         System.out.println(sortednNumbers);
    }
    
}
