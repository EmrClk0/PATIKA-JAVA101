import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("km gir: ");
        double km = scanner.nextDouble();
        double acılısPrice=10.0, pricePerKM=2.20;
        double price;

        price=((pricePerKM*km)+acılısPrice<20)?(20):((pricePerKM*km)+acılısPrice);
        System.out.println("ödenecek: "+price);

    }
}
