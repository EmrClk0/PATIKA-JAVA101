import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int number, total=0;

        do {
            System.out.print("sayı gir (tek girersen program sonlanır)");
            number = scanner.nextInt();
            if(number%2==0 && number%4==0)
                total += number;


        }while(number%2==0);


        System.out.println("sonuc" + total);
    }
}
