import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("sayı girin: ");
        int number = scanner.nextInt();
        double result=0;

        for(double i=1; i<=number; i++){
            result += (double)(1/i);
        }

        System.out.println("result " + result);
    }
}
