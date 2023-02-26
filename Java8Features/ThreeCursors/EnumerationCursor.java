// package Test.Java8Features.ThreeCursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {
        
        // create a vector and add elements to it
        Vector<Integer> vector = new Vector<>();
        for(int i=0; i<=10; i++) vector.add(i);
        System.out.println(vector);

        // create a enumeration over vector elements and print elements
        Enumeration<Integer> enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            Integer I = (Integer) enumeration.nextElement();
            if(I%2 == 0) {System.out.print(I + " ");}
        }
    }    
}
