//Write a Java program to find and print the prime factors of a given number.


import java.util.Scanner;

public class program1d {

    public static void main(String[] args) {
      
	System.out.println("Shikha  2210997218");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Prime factors of " + number + " are:");
        printPrimeFactors(number);
    }

    public static void printPrimeFactors(int n) {
      
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // n must be odd at this point, so we can skip one element (i = i + 2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}