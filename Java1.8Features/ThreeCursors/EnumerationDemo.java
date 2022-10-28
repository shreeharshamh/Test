import java.util.Enumeration;
import java.util.Vector;

class EnumerationDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i=0; i<=10; i++) {
            v.addElement(i);
        }
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()) {
            Integer I = (Integer) e.nextElement();
            if(I%2 == 0) {
                System.out.print(I + " ");
            }
        }
    }
}