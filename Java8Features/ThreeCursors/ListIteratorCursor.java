package Test.Java8Features.ThreeCursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorCursor {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Nagendra");
        list.add("Pinky");
        list.add("Nishant");
        list.add("Paramesh");

        ListIterator<String> ltr = list.listIterator();
        while(ltr.hasNext()) {
            String S = (String) ltr.next();
            if(S.equals("Pinky")) ltr.remove(); // [Nagendra, Nishant, Paramesh]
            else if(S.equals("Nishant")) ltr.add("Santosh"); // [Nagendra, Nishant, Paramesh, Santosh]
            else if(S.equals("Paramesh")) ltr.set("Janardhan"); // [Nagendra, Nishant, Janardhan, Santosh]
            System.out.println(ltr.toString());
        }
        

    }    

}
