import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ComparatorDemo1 {
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

         List<Integer> numbers = arrayList.stream().sorted((i1,i2) -> (i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
         System.out.println(numbers.toArray()[0]);
    }
}
