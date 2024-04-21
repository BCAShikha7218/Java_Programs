/*Write a program that takes three integers as input representing the lengths of the sides of
a triangle and determines whether the triangle is equilateral, isosceles, or scalene.*/


import java.util.Scanner;

public class program3b {

    public static void main(String[] args) {

	System.out.println("Shikha  2210997218");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }

        scanner.close();
    }
}