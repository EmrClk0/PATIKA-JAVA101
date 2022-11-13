import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Fiyat gir: ");
        double price = scanner.nextDouble();
        int kdvRate;
        double kdvprice;
        double priceWithKdv;

        kdvRate=(price>0 && price<1000)?(18):(8);
        kdvprice = (double) price*kdvRate/(100);
        priceWithKdv = price + kdvprice;

        System.out.println("ÜRÜN FİYATI:    "+price);
        System.out.println("ürün kdv tutarı "+ kdvprice);
        System.out.println("ürün kdvli tutar: "+ priceWithKdv);


    }
}
