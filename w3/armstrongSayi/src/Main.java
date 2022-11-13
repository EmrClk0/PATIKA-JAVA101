import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("sayı gir: ");
        int number = scanner.nextInt();
        int basamak;
        int total=0;
        do {
           basamak= number%10;
           total +=basamak;
           number/=10;

        }while(number!=0);

        System.out.println("toplam " + total);
    }
}
