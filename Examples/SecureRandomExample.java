// package Test.Examples;

import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) {
        // Create an instance of SecureRandom class
        SecureRandom rand = new SecureRandom();

        // Generate random integer in range 0 to 999 & 1995 to 2000
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1995, 2000);

        System.out.println(rand_int1);
        System.out.println(rand_int2);
    }
}
