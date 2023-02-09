import java.util.Random;

public class MathRandomExample2 {
    public static void main(String[] args) {
        
        // Create an instance of Random class
        Random rand = new Random();

        // Generate random integer in range 0 to 1000 and 1995 to 2000
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1995, 2000);

        // Print the result
        System.out.println("Random integer : " + rand_int1);
        System.out.println("Random integer : " + rand_int2);
    }
}