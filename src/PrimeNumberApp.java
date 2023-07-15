import java.util.Scanner;

public class PrimeNumberApp {
    public static void main(String[] args) {
        System.out.println("******* Welcome to the PrimeNumber App *******");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Please enter a number (Enter 0 to exit):");
            int number = scanner.nextInt();

            if (number == 0) {
                exit = true;
                System.out.println("Exiting the application. Goodbye!");
            } else if (number < 2) {
                System.out.println("The number must be greater than or equal to 2.");
            } else {
                boolean isPrime = true;

                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(number + " is a prime number.");
                } else {
                    System.out.println(number + " is not a prime number.");
                }
            }
        }

        scanner.close();
    }
}
