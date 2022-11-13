import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Sicakligi giriniz: ");
        int heat= scanner.nextInt();

        if (heat<5){
            System.out.println("kayak yapabilirsin");
        }
        else if (heat>=5 && heat<15){
            System.out.println("sinemaya gidebilirsin");
        }
        else if (heat>=15 && heat<25){
            System.out.println("piknige gidebilirsin");
        }
        else if (heat>=25) {
            System.out.println("yuzmeye gidebilirsin");
        }
    }
}
