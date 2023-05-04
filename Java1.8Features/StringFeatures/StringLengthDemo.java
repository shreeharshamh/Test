// package Test.StringPoolDemo;

/*
 * length() method prints the length of the string
 */
public class StringLengthDemo {
    public static void main(String[] args) {
        String str = "   Abra ka dabra  " ;
        System.out.println(str.length());       // 28

        System.out.println(str.trim().substring(3));
        System.out.println(str.trim());

    }
    
}
