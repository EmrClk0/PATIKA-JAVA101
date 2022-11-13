import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double pi = 3.14;
        System.out.print("yarıcap: ");
        double radius = scanner.nextDouble();
        System.out.print("merkez acı ");
        double angle = scanner.nextDouble();

        double area = (pi*Math.pow(radius,2)*angle)/360;
        System.out.println("alan: "+area);

    }
}
