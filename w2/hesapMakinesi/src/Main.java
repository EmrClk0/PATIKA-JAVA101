import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("islem girini +-*/: ");
        String islem = scanner.next();

        System.out.print("sayı1: ");
        double num1 = scanner.nextDouble();

        System.out.print("sayı2: ");
        double num2 = scanner.nextDouble();

        double result=0;

        switch (islem){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result= num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                result = num1/num2;
                break;
        }

        System.out.println("sonuc: " + result);
    }
}

