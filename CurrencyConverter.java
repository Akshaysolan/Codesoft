
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.75;

        System.out.println("Welcome to Currency Converter!");

        
        System.out.print("Choose the base currency (USD, EUR, GBP): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Choose the target currency (USD, EUR, GBP): ");
        String targetCurrency = scanner.next().toUpperCase();

       
        double exchangeRate;
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            exchangeRate = usdToEurRate;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            exchangeRate = usdToGbpRate;
        } else {
            System.out.println("Invalid currency selection.");
            return;
        }

       
        System.out.print("Enter the amount in " + baseCurrency + ": ");
        double amountToConvert = scanner.nextDouble();

       
        double convertedAmount = amountToConvert * exchangeRate;

        
        System.out.println("\nConversion Result:");
        System.out.println("Amount in " + baseCurrency + ": " + amountToConvert);
        System.out.println("Converted Amount in " + targetCurrency + ": " + convertedAmount + " " + targetCurrency);

       
        scanner.close();
    }
}
