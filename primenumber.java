import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.println("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " are:");
        generatePrimeNumbersInRange(lowerBound, upperBound);
    }

    public static void generatePrimeNumbersInRange(int lowerBound, int upperBound) {
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}