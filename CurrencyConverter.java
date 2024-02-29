package java1;
import java.util.Scanner;
public class CurrencyConverter {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        double inrToDollarRate = 65.25;
	        double dollarToInrRate = 1 / inrToDollarRate;

	        System.out.println("Currency Converter");
	        System.out.println("1. Convert INR to Dollar");
	        System.out.println("2. Convert Dollar to INR");
	        System.out.print("Enter your choice (1/2): ");
	        int choice = scanner.nextInt();

	        System.out.print("Enter the amount: ");
	        double amount = scanner.nextDouble();

	        double convertedAmount;
	        String targetCurrency;

	        if (choice == 1) {
	            convertedAmount = amount * dollarToInrRate;
	            targetCurrency = "Dollar";
	        } else if (choice == 2) {
	            convertedAmount = amount * inrToDollarRate;
	            targetCurrency = "INR";
	        } else {
	            System.out.println("Invalid choice. Please select 1 or 2.");
	            return;
	        }

	        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrency);
	    }
	}



