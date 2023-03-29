package Test.StringPoolDemo;

import java.net.SocketTimeoutException;

/*
 * Java program to demonstrate functioning of split() method
 * split(regex)
 * split(regex, int limit)      where limit is nothing but array index limit
 */
public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, this is demonstration of split method";
        String[] strSplit = str.split(" ", str.length());

        for(String s : strSplit) {
            System.out.println(s);
        }
    }
}
