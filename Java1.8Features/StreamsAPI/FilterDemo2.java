import java.util.ArrayList;
import java.util.List;

public class FilterDemo2 {
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
         long failedStudents = arrayList.stream().filter(i->i<25).count();
         System.out.println(failedStudents);
    }
}
