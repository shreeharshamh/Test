// package Test.Java1.8Features.ThreeCursors

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> vectorObject = new Vector<>();
        for(int i=0; i<=10; i++) {
            vectorObject.add(i);
        }
        System.out.println(vectorObject);

        Enumeration<Integer> enumerationObject = vectorObject.elements();
        while(enumerationObject.hasMoreElements()) {
            Integer I = (Integer) enumerationObject.nextElement();
            if(I % 2 == 0) System.out.print(I + " ");
        }
    }
}