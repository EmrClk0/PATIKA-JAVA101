import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("taban:. ");
        int base = scanner.nextInt();

        System.out.print("kuvvet");
        int power = scanner.nextInt();
        int result=1;

        for(int i=0; i<power; i++){
            result *= base;

        }

        System.out.println("sonuc: " +result);
    }
}
