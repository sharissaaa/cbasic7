import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = checkPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false; // 1 and numbers less than or equal to 1 are not prime
        }

        // Check for factors from 2 to the square root of the number
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false; // If a factor is found, the number is not prime
            }
        }

        return true; // If no factor is found, the number is prime
    }
}
