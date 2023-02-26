package Test.Java8Features.ThreeCursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCursor {
   public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<=10; i++) numbers.add(i);
        System.out.println(numbers);

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
            Integer I = (Integer) itr.next();
            if(I % 2 == 0) System.out.print(I + " ");
            else itr.remove();
        }
   } 
}
