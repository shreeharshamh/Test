import java.util.Scanner;

public class TestPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        Integer num = scanner.nextInt();
        boolean isPrime = true;
        scanner.close();

        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                isPrime = false;
                System.out.println(num + " is not a prime.");
                break;
            }
        }

        if(isPrime) { System.out.println(num + " is prime.");}
    }
}