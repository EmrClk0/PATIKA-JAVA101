import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double[] numbers = new double[3];
        for (int i=0;i<numbers.length; i++){
            System.out.print("sayı gir: ");
             numbers[i] = scanner.nextDouble();
        }

        Arrays.sort(numbers);
        System.out.print("sıralanmıs dizi ");
        System.out.println(Arrays.toString(numbers));


    }
}
