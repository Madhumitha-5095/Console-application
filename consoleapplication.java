import java.util.Scanner;

public class consoleapplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Prime Number");
            System.out.println("2. Odd or Even");
            System.out.println("3. Amicable Number");
            System.out.println("4. Strong Number");
            System.out.println("5. Magic Number");
            System.out.println("6. Fibonacci Series up to the given range");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    if (isPrime(n)) {
                        System.out.println(n + " is a prime number.");
                    } else {
                        System.out.println(n + " is not a prime number.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int b = scanner.nextInt();
                    if (isOdd(b)) {
                        System.out.println(b + " is an odd number.");
                    } else {
                        System.out.println(b + " is an even number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int num2 = scanner.nextInt();
                    if (areAmicable(num1, num2)) {
                        System.out.println(num1 + " and " + num2 + " are amicable numbers.");
                    } else {
                        System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
                    }
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int c = scanner.nextInt();
                    if (isStrong(c)) {
                        System.out.println(c + " is a strong number.");
                    } else {
                        System.out.println(c + " is not a strong number.");
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    int d = scanner.nextInt();
                    if (isMagic(d)) {
                        System.out.println(d + " is a magic number.");
                    } else {
                        System.out.println(d + " is not a magic number.");
                    }
                    break;
                case 6:
                    System.out.print("Enter the range: ");
                    int range = scanner.nextInt();
                    System.out.println("Fibonacci series up to " + range + ":");
                    printFibonacci(range);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
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
        return true;
    }
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static boolean areAmicable(int num1, int num2) {
        return sumOfDivisors(num1) == num2 && sumOfDivisors(num2) == num1;
    }
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isMagic(int number) {
        while (number > 9) {
            number = sumOfDigits(number);
        }
        return number == 1;
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void printFibonacci(int range) {
        int a = 0, b = 1;
        while (a <= range) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
