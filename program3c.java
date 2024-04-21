/*Write a program that converts an amount in one currency to another based on the choice. The program should prompt the user to enter the amount, the source currency,
and the target currency (e.g., USD to EUR). Use a switch-case statement to handle
different currency conversions.*/


import java.util.Scanner;

public class program3c {

    public static void main(String[] args) {
	
	System.out.println("Shikha  2210997218");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Enter the source currency (e.g., USD, EUR, GBP): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.println("Enter the target currency (e.g., USD, EUR, GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

        double convertedAmount = 0;

        switch (sourceCurrency) {
            case "USD":
                switch (targetCurrency) {
                    case "USD":
                        convertedAmount = amount;
                        break;
                    case "EUR":
                        convertedAmount = amount * 0.88;
                        break;
                    case "GBP":
                        convertedAmount = amount * 0.76;
                        break;
                }
                break;
            case "EUR":
                switch (targetCurrency) {
                    case "USD":
                        convertedAmount = amount * 1.14;
                        break;
                    case "EUR":
                        convertedAmount = amount;
                        break;
                    case "GBP":
                        convertedAmount = amount * 0.87;
                        break;
                }
                break;
            case "GBP":
                switch (targetCurrency) {
                    case "USD":
                        convertedAmount = amount * 1.32;
                        break;
                    case "EUR":
                        convertedAmount = amount * 1.15;
                        break;
                    case "GBP":
                        convertedAmount = amount;
                        break;
                }
                break;
        }

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}