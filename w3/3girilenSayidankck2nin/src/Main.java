import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("sayı gir: ");
        int number = scanner.nextInt();

        for(int i=0; i<=number; i++)
            if(i%4==0 && i%5==0)
                System.out.println(i);
    }
}
