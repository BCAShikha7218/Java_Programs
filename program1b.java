//Write a Java program to print Pascals Triangle of n rows. Use nested loops to calculate the values.


import java.util.Scanner;

public class program1b {

    public static void main(String[] args) {

	System.out.println("Shikha  2210997218");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " "); 
                num= num* (i - j) / (j + 1);
            }
            System.out.println(); 
        }
    }
}