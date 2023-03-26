import java.util.*;

public class Test {
    public static void main(String[] args) {
        String name = "pavankumar";
        ArrayList<Character> al = new ArrayList<>();
        for(int i=0; i<name.length(); i++) {
            al.add(name.charAt(i));
        }
        long  count = al.stream().count();
        long count1 = al.stream().distinct().count();
        System.out.println(count + " " + count1);
    }
}
