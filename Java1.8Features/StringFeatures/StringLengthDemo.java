package Test.StringPoolDemo;

/*
 * length() method prints the length of the string
 */
public class StringLengthDemo {
    public static void main(String[] args) {
        String str = "Abra ka dabra";
        System.out.println(str.length());       // 13

        System.out.println(str.substring(0, str.length()));
        System.out.println(str.trim("a"));

    }
    
}
