import java.lang.Math;

public class MathRandomExample {
    public static void main(String[] args) {
        // Print a random number using "Math.random()"
        double rand = Math.random();
        System.out.println("random number: " + rand);
        
        // Print Random Numbers within range 1 to 10 using Math.randin()
        int max = 20;
        int min = 1;
        int range = max - min + 1;

        for (int i=0; i<=5; i++) {
            int rands = (int) (Math.random() * range) + min;
            System.out.println(rands);
        }

    }
}