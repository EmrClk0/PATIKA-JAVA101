import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Sayı gir: ");
        int number = scanner.nextInt();

        for(int i=0; i<=number; i++){
            if(i%2==0)
                System.out.println(i);
        }

    }
}
